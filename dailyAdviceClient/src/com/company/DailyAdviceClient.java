package com.company;

import java.io.*;
import java.net.*;

public class DailyAdviceClient {

    String[] adviceList = {"Ешь меньше", "Купи джинсы", "Нет, не годится", "Будь честнее", "Смени прическу"};

    private String getAdvice() {
        int rand = (int) (Math.random() * adviceList.length);
        return adviceList[rand];
    }

    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);
            while(true) {
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
