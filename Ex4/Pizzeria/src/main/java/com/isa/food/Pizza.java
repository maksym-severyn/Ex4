package com.isa.food;

import com.isa.food.details.PizzaKind;
import com.isa.food.details.PizzaSize;

public class Pizza extends Food {
    private PizzaSize size;
    private boolean isVegetarian;
    private PizzaKind kind;

    public Pizza(PizzaSize size, PizzaKind kind) {
        this.size = size;
        this.kind = kind;
        this.isVegetarian = this.kind.checkIsVegetarian();
    }

    public PizzaSize getSize() {
        return size;
    }

    public PizzaKind getKind() {
        return kind;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void setKind(PizzaKind kind) {
        this.kind = kind;
        this.isVegetarian = this.kind.checkIsVegetarian();
    }
}

