package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.sound.midi.*;
public class Main {
    public static void main (String[] args) {
        String arg1 = null;
        String arg2 = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            arg1 = reader.readLine();
            arg2 = reader.readLine();
        } catch (IOException e) {
            System.out.println("Fault");
        }

        Main mini = new Main();
        System.out.println(arg1 + ' ' + arg2);
        if (arg1.equals(null) && arg2.equals(null)) {
            System.out.println("You have forgoten about all arguments...");
        } else {
            int instrument = Integer.parseInt(arg1);
            int note = Integer.parseInt(arg2);
            mini.play (instrument, note);
        }
    }

    public void play (int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstument = new MidiEvent(first, 1);
            track.add(changeInstument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
