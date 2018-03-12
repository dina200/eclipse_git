package com.company;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    ArrayList clientOutputStream;


    public class ClientHander implements Runnable {
        BufferedReader reader;
        Socket socket;

        public ClientHander(Socket socket) {
            try {
                this.socket = socket;
                this.reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void run() {
            String message;

            try {
                while ((message = this.reader.readLine()) != null) {
                    System.out.println("read" + message);
                    tellEveryone(message);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            }
        }
        public void go() {
            clientOutputStream = new ArrayList();
            try {
                ServerSocket serverSocket = new ServerSocket(5000);

                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                    clientOutputStream.add(writer);

                    Thread t = new Thread(new ClientHander(clientSocket));
                    t.start();
                    System.out.println("got a connection");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


    public void tellEveryone(String message) {
        Iterator it = clientOutputStream.iterator();
        while(it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
