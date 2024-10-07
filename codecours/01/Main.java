import factorymethod.Produit;
import factorymethod.AbstractProdFact.FactoryProduit1;
import factorymethod.AbstractProdFact.FactoryProduit2;
import factorymethod.AbstractProdFact.FactoryProduit3;

public class Main {

    public static void main(String[] args) {

        // Factory Methos Design Pattern
        Produit p = new Produit();

        FactoryProduit1 fact1 = new FactoryProduit1();

        System.out.print("Utilisation fabrique 1");
        p = fact1.creerProduit();
        p.prodMethod();

        FactoryProduit2 fact2 = new FactoryProduit2();

        System.out.print("\nUtilisation fabrique 2");
        p = fact2.creerProduit();
        p.prodMethod();

        FactoryProduit3 fact3 = new FactoryProduit3();

        System.out.print("\nUtilisation fabrique 3");
        p = fact3.creerProduit();
        p.prodMethod();

        System.out.println("\n");

        // Operation mathematique avec le Patron singleton
        float sum1 = OperationMathematique.getInstance().sum(2, 5);
        System.out.printf("la somme est %f", sum1);
        OperationMathematique s1 = OperationMathematique.getInstance(8, 3, 4);
        s1.affiche();
        OperationMathematique s2 = OperationMathematique.getInstance(5, 9, 3);
        System.out.println(s2.sum(1, 2));

        System.out.println("\n");

        // Singleton design pattern
        Singleton singleton = Singleton.getInstance(2, 3);
        Singleton singleton2 = Singleton.getInstance(2, 4, 5);
        float sum = singleton.sum();
        float sum2 = singleton2.sum();
        System.out.println("Sum with Singleton design pattern: " + sum + " -> " + sum2);
    }
}
