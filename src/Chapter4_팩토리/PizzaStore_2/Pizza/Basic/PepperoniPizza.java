package Chapter4_팩토리.PizzaStore_2.Pizza.Basic;

import Chapter4_팩토리.PizzaStore.PizzaIngredientFactory.PizzaIngredientFactory;
import Chapter4_팩토리.PizzaStore_2.Pizza.Pizza;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
