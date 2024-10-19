package premier_support;

import premier_support.factorymethod.entities.Produit;
import premier_support.factorymethod.factory.FactoryProduit1;
import premier_support.factorymethod.factory.FactoryProduit2;
import premier_support.factorymethod.factory.FactoryProduit3;
import premier_support.singleton.OperationMathematique;
import premier_support.singleton.ImmutableSum;

public class Main {

    public static void main(String[] args) {

        // ? Factory Methos Design Pattern
        Produit p;

        // * Utililation Factory 1
        FactoryProduit1 fact1 = new FactoryProduit1();

        System.out.print("Utilisation ");
        p = fact1.creerProduit();
        p.prodMethod();

        // * Utililation Factory 2
        FactoryProduit2 fact2 = new FactoryProduit2();

        System.out.print("\nUtilisation ");
        p = fact2.creerProduit();
        p.prodMethod();

        // * Utililation Factory 3
        FactoryProduit3 fact3 = new FactoryProduit3();

        System.out.print("\nUtilisation ");
        p = fact3.creerProduit();
        p.prodMethod();

        System.out.print("\n");

        // ? Operation mathematique avec le Patron singleton
        OperationMathematique s1 = OperationMathematique.getInstance(8, 3, 4);
        s1.affiche();
        OperationMathematique s2 = OperationMathematique.getInstance(4, 1);
        s2.affiche();
        OperationMathematique s3 = OperationMathematique.getInstance();
        s3.affiche();
        System.out.print("\nla somme est: " + s3.sum(2, 4));

        System.out.print("\n");

        // ? Singleton design pattern
        ImmutableSum singleton = ImmutableSum.getInstance(2, 3);
        ImmutableSum singleton2 = ImmutableSum.getInstance(2, 4, 5);
        float sum = singleton.sum();
        float sum2 = singleton2.sum();
        System.out.println("Immutable sum with Singleton design pattern: " + sum + " -> " + sum2);
    }
}
