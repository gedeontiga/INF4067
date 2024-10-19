package second_support.builder.entities;

public class Pizza {
    private String pate;
    private String sauce;
    private String garniture;

    public String getPate() {
        return pate;
    }

    public void setPate(String pate) {
        this.pate = pate;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getGarniture() {
        return garniture;
    }

    public void setGarniture(String garniture) {
        this.garniture = garniture;
    }

    public void print() {
        System.out.println(this.toString());
        System.out.println("Pate = " + pate + "\nSauce = " + sauce + "\nGarniture = " + garniture);
    }
}
