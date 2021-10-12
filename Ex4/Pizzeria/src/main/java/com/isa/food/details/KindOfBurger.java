package com.isa.food.details;

public enum KindOfBurger {
    HAMBURGER("base, chop, dip; 10 min 180 C");

    private String recipe;

    KindOfBurger(String recipe) {
        this.recipe = recipe;
    }

    public String getRecipe() {
        return recipe;
    }
}
