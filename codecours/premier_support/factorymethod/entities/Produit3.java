package premier_support.factorymethod.entities;

public class Produit3 extends Produit {

    @Override
    public void prodMethod() {
        System.out.print("\n");
        super.prodMethod();
        System.out.print("fabrique 3");
    }

}
