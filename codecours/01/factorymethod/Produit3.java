package factorymethod;

public class Produit3 extends Produit {

    @Override
    public void prodMethod() {
        System.out.println();
        super.prodMethod();
        System.out.print(" 3");
    }

}
