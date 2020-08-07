package com.zuyatna.designpattern;

import com.zuyatna.designpattern.concreteproducts.PaymentConfirmationChat;
import com.zuyatna.designpattern.concreteproducts.ProductChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        ChatFactory factory = new ChatFactory();

        List<String> features = new ArrayList<>();
        features.add("entertainment");
        features.add("fashion");
        features.add("information");

        System.out.print("say: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        Chat chat = factory.createChat(text);

        try {

            if (chat instanceof ProductChat) {

                ((ProductChat) chat).setProducts(features);
            }
            else if (chat instanceof PaymentConfirmationChat) {

                ((PaymentConfirmationChat) chat).setOrderNum("\nYour Payment Number is 0001");
            }

            System.out.println(chat.getResponseText());
        }
        catch (Exception e) {

            System.out.println("I don't understand " + e);
        }
    }
}
