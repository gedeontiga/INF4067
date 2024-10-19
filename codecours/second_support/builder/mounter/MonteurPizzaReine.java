package second_support.builder.mounter;

public class MonteurPizzaReine extends MonteurPizza {

    @Override
    public MonteurPizzaReine monterPate() {
        pizza.setPate("croisee");
        return this;
    }

    @Override
    public MonteurPizzaReine monterSauce() {
        pizza.setSauce("douce");
        return this;
    }

    @Override
    public MonteurPizzaReine monterGarniture() {
        pizza.setGarniture("jambon+champignon");
        return this;
    }

}