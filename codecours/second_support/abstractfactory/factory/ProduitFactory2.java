package second_support.abstractfactory.factory;

import second_support.abstractfactory.entities.ProduitA;
import second_support.abstractfactory.entities.ProduitA2;
import second_support.abstractfactory.entities.ProduitB;
import second_support.abstractfactory.entities.ProduitB2;

public class ProduitFactory2 implements IProduitFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB2();
    }

}
