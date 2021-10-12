package com.isa;

import com.isa.food.Burger;
import com.isa.food.Drink;
import com.isa.food.OrderPart;
import com.isa.food.Pizza;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Order {
    private ArrayList<OrderPart> listOfOrderPart = new ArrayList<>();
    private Client client;

    public Order(Client client, ArrayList<String> orderParticularParts) throws Exception {
        this.client = client;
        for (String i : orderParticularParts) {
            String[] list = i.split(",");
            if ("PIZZA".equals(list[0].toUpperCase(Locale.ROOT))) {
                OrderPart newPizza = new Pizza(list[2], list[3]);
                newPizza.setQuantity(Integer.valueOf(list[1]));
                addOrderPartIntoList(newPizza);
            } else if ("DRINK".equals(list[0].toUpperCase(Locale.ROOT))) {
                OrderPart newDrink = new Drink(list[2]);
                newDrink.setQuantity(Integer.valueOf(list[1]));
                addOrderPartIntoList(newDrink);
            } else if ("BURGER".equals(list[0].toUpperCase(Locale.ROOT))) {
                OrderPart newBurger = new Burger(list[2]);
                newBurger.setQuantity(Integer.valueOf(list[1]));
                addOrderPartIntoList(newBurger);
            } else {
                throw new Exception("Nie znaleziono pozycji: " + list[0] + ". Błąd w zamówieniu clienta: " + this.client.getName());
                //System.out.println("Nie znaleziono pozycji: " + list[0] + ". Błąd w zamówieniu clienta: " + this.client.getName());
            }
        }
    }

    public ArrayList<OrderPart> getListOfFood() {
        return listOfOrderPart;
    }

    public Client getClient() {
        return client;
    }

    private void addOrderPartIntoList(OrderPart orderPart) {
        this.listOfOrderPart.add(orderPart);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(listOfOrderPart, order.listOfOrderPart) && Objects.equals(client, order.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfOrderPart, client);
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ",\n   listOfOrderPart=" + listOfOrderPart +
                '}';
    }
}
