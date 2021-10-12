package com.isa.food;

import com.isa.food.details.KindOfDrink;

import java.util.Locale;
import java.util.Objects;

public class Drink extends Food {
    private boolean isAlcoholic;
    private KindOfDrink kind;

    public Drink(String kind) {
        setKindFromString(kind);
    }

    private void setKindFromString(String kind) {
        for (KindOfDrink i : KindOfDrink.values()) {
            if (kind.toUpperCase(Locale.ROOT).equals(i.toString())) {
                this.kind = i;
                this.isAlcoholic = i.checkIsAlcoholic();
            }
        }

        try {
            if (this.kind == null) {
                throw new Exception("Nie znaleziono drinka: \"" + kind + "\". Sprawdź swoje zamówienie!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setKind(KindOfDrink kind) {
        this.kind = kind;
        this.isAlcoholic = this.kind.checkIsAlcoholic();
    }

    public boolean getIsAlcoholic() {
        return isAlcoholic;
    }

    public KindOfDrink getKind() {
        return kind;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return isAlcoholic == drink.isAlcoholic && kind == drink.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAlcoholic, kind);
    }
}

