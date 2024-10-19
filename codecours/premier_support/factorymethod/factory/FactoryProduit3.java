package premier_support.factorymethod.factory;

import premier_support.factorymethod.entities.Produit3;

public class FactoryProduit3 implements AbstractProdFact {

    @Override
    public Produit3 creerProduit() {
        return new Produit3();
    }
}
