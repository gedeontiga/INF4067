package second_support;

import second_support.abstractfactory.entities.ProduitA;
import second_support.abstractfactory.entities.ProduitB;
import second_support.abstractfactory.factory.ProduitFactory1;
import second_support.abstractfactory.factory.ProduitFactory2;
import second_support.builder.Directeur;
import second_support.builder.entities.Pizza;
import second_support.builder.mounter.MonteurPizzaPiquante;
import second_support.builder.mounter.MonteurPizzaReine;

public class Main {

    public static void main(String[] args) {

        // ? Builder design pattern

        // * Build pizza reine
        System.out.println("\033[95m\nPizza reine :\033[97m");
        Pizza pizzaReine = Directeur.builderPizza(new MonteurPizzaReine());
        pizzaReine.print();

        // * ? Build pizza piquante
        System.out.println("\033[95m\nPizza piquante :\033[97m");
        Pizza pizzaPiquante = Directeur.builderPizza(new MonteurPizzaPiquante());
        pizzaPiquante.print();

        System.out.println();

        // ? Abstract Factory design pattern
        ProduitFactory1 produitFactory1 = new ProduitFactory1();
        ProduitFactory2 produitFactory2 = new ProduitFactory2();

        ProduitA produitA = null;
        ProduitB produitB = null;

        // * Factory for first product family
        System.out.println("\033[93mUtilisation de la première fabrique\033[97m");
        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        // * Factory for second product family
        System.out.println("\033[93mUtilisation de la deuxième fabrique\033[97m");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }
}