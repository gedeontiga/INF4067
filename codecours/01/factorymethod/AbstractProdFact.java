package factorymethod;

public interface AbstractProdFact {

    public default Produit creerProduit() {
        return new Produit();
    }

    public class FactoryProduit1 implements AbstractProdFact {

        @Override
        public Produit1 creerProduit() {
            return new Produit1();
        }
    }

    public class FactoryProduit2 implements AbstractProdFact {

        @Override
        public Produit2 creerProduit() {
            return new Produit2();
        }
    }

    public class FactoryProduit3 implements AbstractProdFact {

        @Override
        public Produit3 creerProduit() {
            return new Produit3();
        }
    }
}
