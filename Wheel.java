import java.io.Serializable;

public class Wheel {
    private String brand, ID;

    public Wheel(String brand, String ID) {
        this.brand = brand;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Brand: " + "\u001B[33m" + brand + "\u001B[0m" + ", ID: " + "\u001B[33m" + ID + "\u001B[0m";
    }
}
