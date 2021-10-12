package com.isa;

import com.isa.food.OrderPart;

import java.util.ArrayList;

public class BaseOfOrders {
    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrders(Order... orders) {
        for (Order i : orders) {
            this.orders.add(i);
        }
    }

    public void displayAllOrders() {
        for (Order i : orders) {
            System.out.println(i.toString());
            for (OrderPart j : i.getListOfFood()) {

                System.out.println("       " + j.toString());
            }
        }
    }
}
