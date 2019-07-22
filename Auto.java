import java.io.Serializable;

public class Auto {
    private Wheel w;
    private int n_wheels;
    private String licence_plate;
    //--------------------------------------------------------------------------------------------------------------------------------
    public Auto(String licence) {
        licence_plate = licence;
        n_wheels = 4;
        w = new Wheel("Michelin", "M4FGG81");
    }
    //--------------------------------------------------------------------------------------------------------------------------------
    public Auto(String licence, int n_wheels) {
        licence_plate = licence;
        this.n_wheels = n_wheels;
        w = new Wheel("Michelin", "M4FGG81");
    }
    //--------------------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Licence plate: " + "\u001B[33m" + licence_plate + "\u001B[0m" + ", number of wheels: " + "\u001B[33m" + n_wheels + "\u001B[0m" + ", wheel-type: " + w.toString();
    }
}
