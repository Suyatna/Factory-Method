package com.zuyatna.designpattern.concreteproducts;

import com.zuyatna.designpattern.Chat;

import java.util.List;

public class ProductChat implements Chat {

    private List<String> products;

    public void setProducts(List<String> products) {

        this.products = products;
    }

    @Override
    public String getResponseText() {

        System.out.println("product is here!");

        return null;
    }
}
