package second_support.builder.mounter;

public class MonteurPizzaPiquante extends MonteurPizza {

    @Override
    public MonteurPizzaPiquante monterPate() {
        pizza.setPate("feuilletee");
        return this;
    }

    @Override
    public MonteurPizza monterSauce() {
        pizza.setSauce("piquante");
        return this;
    }

    @Override
    public MonteurPizza monterGarniture() {
        pizza.setGarniture("pepperoni+salami");
        return this;
    }

}
