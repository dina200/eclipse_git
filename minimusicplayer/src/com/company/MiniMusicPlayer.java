package com.company;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer{

    static JFrame f = new JFrame("My first player");
    static MyDrawPanel mdp;

    public void play() {
        setUpGUI();
        try {
            Sequencer sequenser = MidiSystem.getSequencer();//player
            sequenser.open();

            sequenser.addControllerEventListener(mdp, new int[] {127});
            Sequence seq = new Sequence(Sequence.PPQ, 4);//succession
            Track track = seq.createTrack();//new track

            int r;
            for (int i = 0; i < 60; i += 4) {
                r = (int) (Math.random() * 50 + 1);
                track.add(makeEvent(144, 1, r,100, i));
                track.add(makeEvent(176, 1, 127,0, i));
                track.add(makeEvent(128, 1, r, 100, i + 2));
            }

            sequenser.setSequence(seq);
            sequenser.start();
            sequenser.setTempoInBPM(120);
        } catch (Exception e) { e.printStackTrace(); }
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setUpGUI() {
        mdp = new MyDrawPanel();
        f.setContentPane(mdp);
        f.setBounds(30, 30, 300, 300);
        f.setVisible(true);
    }

    public static MidiEvent makeEvent (int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage sm = new ShortMessage();
            sm.setMessage(comd, chan, one, two);
            event = new MidiEvent(sm, tick);
        } catch (Exception e) { }
        return event;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg = false;

        public void paintComponent(Graphics g) {
            if (msg) {

                Graphics2D g2 = (Graphics2D) g;

                int r = (int) (Math.random() * 250);
                int gr = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);

                g.setColor(new Color(r, gr, b));

                int ht = (int) (Math.random() * 120 + 10);
                int wh = (int) (Math.random() * 120 + 10);
                int x = (int) (Math.random() * 40 + 10);
                int y = (int) (Math.random() * 40 + 10);
                g.fillRect(x, y, ht, wh);
                msg = false;
            }
        }
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }
    }
}
