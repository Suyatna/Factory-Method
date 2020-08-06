package com.zuyatna.designpattern.concreteproducts;

import com.zuyatna.designpattern.Chat;

public class WelcomeChat implements Chat {

    @Override
    public String getResponseText() {

        return "welcome to chit-chat with me, bro/sis";
    }
}
