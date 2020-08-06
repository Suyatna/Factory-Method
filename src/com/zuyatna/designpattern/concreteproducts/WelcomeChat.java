package com.zuyatna.designpattern.concreteproducts;

import com.zuyatna.designpattern.Chat;

public class WelcomeChat implements Chat {

    @Override
    public String getResponseText() {

        System.out.println("welcome to chat, bro/sis");

        return null;
    }
}
