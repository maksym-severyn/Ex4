package com.isa;

public class Main {
    public static void main(String[] args) {

        BaseOfOrders myBaseOfOrders = new BaseOfOrders();
        OrderService myOrderService = new OrderService();

        myOrderService.completeOrder(myBaseOfOrders, new Client("Zenek","Łąkowa","11E","",123456789 ), "Pizza,1,Large,Pepperoni","Drink,2,Juice");
        myOrderService.completeOrder(myBaseOfOrders, new Client("Krysia", "Nadrzeczna", "6/3", ""), "Pizza,1,small,Diavola","Pizza,1,medium,Capricciosa","Drink,1,Cola");
        myOrderService.completeOrder(myBaseOfOrders, new Client("Antoni", "Polna", "13", "25"), "Burger,1,Hamburger","Drink,1,Bear");

        myBaseOfOrders.displayAllOrders();

    }
}