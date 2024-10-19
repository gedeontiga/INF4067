package premier_support.factorymethod.factory;

import premier_support.factorymethod.entities.Produit;

public interface AbstractProdFact {

    public default Produit creerProduit() {
        return new Produit();
    }
}
