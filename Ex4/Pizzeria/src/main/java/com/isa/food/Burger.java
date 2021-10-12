package com.isa.food;

import com.isa.food.details.KindOfBurger;

import java.util.Locale;
import java.util.Objects;

public class Burger extends OrderPart {
    private KindOfBurger kind;

    public Burger(String kind) {
        setKindFromString(kind);
    }

    private void setKindFromString(String kind) {
        for (KindOfBurger i : KindOfBurger.values()) {
            if (kind.toUpperCase(Locale.ROOT).equals(i.toString())) {
                this.kind = i;
            }
        }

        try {
            if (this.kind == null) {
                throw new Exception("Nie znaleziono burgera o typie: \"" + kind + "\". Sprawdź swoje zamówienie!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setKind(KindOfBurger kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Burger burger = (Burger) o;
        return kind == burger.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind);
    }

    @Override
    public String toString() {
        return "Burger{" +
                "quantity=" + getQuantity() +
                ", kind=" + kind +
                '}';
    }
}
