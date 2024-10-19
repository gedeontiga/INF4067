package premier_support.factorymethod.factory;

import premier_support.factorymethod.entities.Produit1;

public class FactoryProduit1 implements AbstractProdFact {

    @Override
    public Produit1 creerProduit() {
        return new Produit1();
    }
}
