package second_support.abstractfactory.factory;

import second_support.abstractfactory.entities.ProduitA;
import second_support.abstractfactory.entities.ProduitB;

public interface IProduitFactory {
    public ProduitA getProduitA();

    public ProduitB getProduitB();
}
