package second_support.abstractfactory.factory;

import second_support.abstractfactory.entities.ProduitA;
import second_support.abstractfactory.entities.ProduitA1;
import second_support.abstractfactory.entities.ProduitB;
import second_support.abstractfactory.entities.ProduitB1;

public class ProduitFactory1 implements IProduitFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }

}
