package vehicle;

public abstract class Vehicle {

    // Variables.
    private String ownerName;
    private String brand;
    private String model;
    private int year;

    // Constructor.
    public Vehicle(String ownerName, String brand, String model, int year) {
        this.ownerName = ownerName;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Setters methods.

    // Setter owner name method.
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Setter brand method.
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Setter model method.
    public void setModel(String model) {
        this.model = model;
    }

    // Setter year method.
    public void setYear(int year) {
        this.year = year;
    }

    // Getters methods.

    // Getter owner name method.
    public String getOwnerName() {
        return this.ownerName;
    }

    // Getter brand method.
    public String getBrand() {
        return this.brand;
    }

    // Getter model mehtod.
    public String getModel() {
        return this.model;
    }

    // Getter year method.
    public int getYear() {
        return this.year;
    }

    // Disblay information method.
    public abstract void displayInfo();
}
