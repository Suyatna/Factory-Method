package com.zuyatna.designpattern.concreteproducts;

import com.zuyatna.designpattern.Chat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductChat implements Chat {

    private List<String> products;

    public void setProducts(List<String> products) {

        this.products = products;
    }

    @Override
    public String getResponseText() {

        List<String> features = new ArrayList<>();
        features.add("promotion");
        features.add("entertainment");
        features.add("fashion");

        setProducts(features);

        return Arrays.toString(new List[]{products});
    }
}
