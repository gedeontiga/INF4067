package premier_support.factorymethod.factory;

import premier_support.factorymethod.entities.Produit2;

public class FactoryProduit2 implements AbstractProdFact {

    @Override
    public Produit2 creerProduit() {
        return new Produit2();
    }
}
