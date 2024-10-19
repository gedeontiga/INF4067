package second_support.builder;

import second_support.builder.entities.Pizza;
import second_support.builder.mounter.MonteurPizza;

public class Directeur {

    public static Pizza builderPizza(MonteurPizza monteurPizza) {
        return monteurPizza.monterPate()
                .monterSauce()
                .monterGarniture()
                .build();
    }
}
