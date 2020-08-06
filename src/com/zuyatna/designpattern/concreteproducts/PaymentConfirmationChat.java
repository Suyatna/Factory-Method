package com.zuyatna.designpattern.concreteproducts;

import com.zuyatna.designpattern.Chat;

public class PaymentConfirmationChat implements Chat {

    private String orderNum;

    public void setOrderNum(String orderNum) {

        this.orderNum = orderNum;
    }

    @Override
    public String getResponseText() {

        System.out.println("001");

        return null;
    }
}
