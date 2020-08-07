package com.zuyatna.designpattern.concreteproducts;

import com.zuyatna.designpattern.Chat;

public class WelcomeChat implements Chat {

    @Override
    public String getResponseText() {

        return "\nwelcome to chit-chat with me, bro/sis";
    }
}
