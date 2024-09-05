package vehicle;

public class Motorcycle extends Vehicle {

    // Variables.
    private int engineSize;

    // Constructor.
    public Motorcycle(String ownerName, String brand, String model, int year, int engineSize) {
        super(ownerName, brand, model, year);
        this.engineSize = engineSize;

    }

    // Setter engine size method.
    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    // Getter engine size method.
    public int getEngineSize() {
        return this.engineSize;
    }

    // Show motorcycle data function.
    @Override
    public void displayInfo() {
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Motorcycle: " + getBrand() + " Model: " + getModel() + " Year: " + getYear());
        System.out.println("Engine Size: " + this.engineSize + " cc");
    }

}
