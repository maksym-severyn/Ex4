package com.isa.food.details;

public enum KindOfPizza {
    PEPPERONI("base, salami; 3 min 180 C",false),
    CAPRICCIOSA("base, mozzarella cheese, baked ham, mushrooms, artichokes and tomatoes; 4 min 180 C",false),
    DIAVOLA("base, mozzarella cheese, ham, black olives, green chili; 3 min 180 C",false),
    HAWAIIAN("base, mozzarella cheese, pineapple; 3 min 180 C",false),
    VEGGIE("base, olives, salad; 3 min 180 C",true);

    private String recipe;
    private boolean isVegetarian;

    KindOfPizza(String recipe, boolean isVegetarian) {
        this.recipe = recipe;
        this.isVegetarian = isVegetarian;
    }

    public String getRecipe() {
        return recipe;
    }

    public boolean checkIsVegetarian() {
        return isVegetarian;
    }

}
