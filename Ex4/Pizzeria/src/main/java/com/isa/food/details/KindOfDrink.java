package com.isa.food.details;

public enum KindOfDrink {
    JUICE(false),
    COLA(false),
    BEAR(true);

    private boolean isAlcoholic;

    KindOfDrink(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    public boolean checkIsAlcoholic() {
        return isAlcoholic;
    }
}
