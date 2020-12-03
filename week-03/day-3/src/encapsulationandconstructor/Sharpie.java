package encapsulationandconstructor;

public class Sharpie {

    String color;
    double width;
    double inkAmount;

    public Sharpie() {
        this.inkAmount = 100;
    }

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmount--;
    }

    public static void main(String[] args) {

        Sharpie pen1 = new Sharpie();
        Sharpie pen2 = new Sharpie("black", 100);

    }

}
