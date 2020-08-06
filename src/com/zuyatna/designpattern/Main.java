package com.zuyatna.designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        ChatFactory factory = new ChatFactory();

        System.out.print("> ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        Chat chat = factory.createChat(text);
        chat.getResponseText();
    }
}
