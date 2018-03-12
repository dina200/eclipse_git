package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

public class SimpleChatClientA {

    JTextField outgoing;//swing
    PrintWriter writer;//io;
    Socket socket;//net;

    private void setUpNetworking() {
        try {
            socket = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        } catch (IOException e) {
            e.printStackTrace();
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

    public void go() {
        JFrame frame = new JFrame("Simple Chat Client v.1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send It");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUpNetworking();
        frame.setSize(400, 500);
        frame.setVisible(true);
    }


}
