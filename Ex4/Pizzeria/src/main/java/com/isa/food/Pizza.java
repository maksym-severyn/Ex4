package com.isa.food;

import com.isa.food.details.KindOfPizza;
import com.isa.food.details.SizeOfPizza;

import java.util.Locale;
import java.util.Objects;

public class Pizza extends OrderPart {
    private SizeOfPizza size;
    private boolean isVegetarian;
    private KindOfPizza kind;

    public Pizza(SizeOfPizza size, KindOfPizza kind) {
        this.size = size;
        this.kind = kind;
        this.isVegetarian = this.kind.checkIsVegetarian();
    }

    public Pizza(String size, String kind) {
        setSizeFromString(size);
        setKindFromString(kind);
        try {
            this.isVegetarian = this.kind.checkIsVegetarian();
        } catch (NullPointerException e){

            e.printStackTrace();
            System.out.println("***NullPointerException oznacza problem z typem pizzy!***" + "\n");
        }
    }

    public SizeOfPizza getSize() {
        return size;
    }

    public KindOfPizza getKind() {
        return kind;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setSize(SizeOfPizza size) {
        this.size = size;
    }

    public void setSizeFromString(String kind) {
        for (SizeOfPizza i : SizeOfPizza.values()) {
            if (kind.toUpperCase(Locale.ROOT).equals(i.toString())) {
                this.size = i;
            }
        }

        try {
            if (this.size == null) {
                throw new Exception("Nie znaleziono rozmiaru: \"" + kind + "\"!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setKind(KindOfPizza kind) {
        this.kind = kind;
        this.isVegetarian = this.kind.checkIsVegetarian();
    }

    public void setKindFromString(String kind) {
        for (KindOfPizza i : KindOfPizza.values()) {
            if (kind.toUpperCase(Locale.ROOT).equals(i.toString())) {
                this.kind = i;
                this.isVegetarian = i.checkIsVegetarian();
            }
        }

        try {
            if (this.kind == null) {
                throw new Exception("Nie znaleziono pizzy typu: \"" + kind + "\". Sprawdź swoje zamówienie!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return isVegetarian == pizza.isVegetarian && size == pizza.size && kind == pizza.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, isVegetarian, kind);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "quantity=" + getQuantity() +
                ", kind=" + kind +
                ", size=" + size +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}

