package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class SimpleChatClientB {
    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket socket;

    public void go() {
        JFrame frame = new JFrame("Simple Chat Client v.2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        incoming = new JTextArea(25,30);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(true);
        JScrollPane scroller = new JScrollPane(incoming);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(20);
        JButton bSend = new JButton("Send");
        bSend.addActionListener(new SendButtonListener());
        panel.add(scroller);
        panel.add(outgoing);
        panel.add(bSend);
        setUpNetworking();

        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    private void setUpNetworking() {
        try {
            socket = new Socket("127.0.0.1", 5000);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    private class IncomingReader implements Runnable {
        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    incoming.append(message + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
