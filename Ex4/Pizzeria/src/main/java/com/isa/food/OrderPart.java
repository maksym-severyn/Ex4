package com.isa.food;

public class OrderPart {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderPart{" +
                "quantity=" + quantity +
                '}';
    }
}
