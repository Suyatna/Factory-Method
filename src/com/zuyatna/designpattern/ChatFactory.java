package com.zuyatna.designpattern;

import com.zuyatna.designpattern.concreteproducts.PaymentConfirmationChat;
import com.zuyatna.designpattern.concreteproducts.ProductChat;
import com.zuyatna.designpattern.concreteproducts.WelcomeChat;

public class ChatFactory {

    public Chat createChat(String intent) {

        if (intent == null) {

            return null;
        }

        if (intent.equalsIgnoreCase("halo")) {

            return new WelcomeChat();
        }

        if (intent.equalsIgnoreCase("product")) {

            return new ProductChat();
        }

        if (intent.equalsIgnoreCase("payment")) {

            return new PaymentConfirmationChat();
        }

        return null;
    };
}
