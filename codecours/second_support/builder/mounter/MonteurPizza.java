package second_support.builder.mounter;

import second_support.builder.entities.Pizza;

public abstract class MonteurPizza {

    protected Pizza pizza = new Pizza();

    public Pizza build() {
        return pizza;
    }

    public abstract MonteurPizza monterPate();

    public abstract MonteurPizza monterSauce();

    public abstract MonteurPizza monterGarniture();
}
