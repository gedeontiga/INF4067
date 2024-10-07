package factorymethod;

public class Produit2 extends Produit {

    @Override
    public void prodMethod() {
        System.out.println();
        super.prodMethod();
        System.out.print(" 2");
    }

}
