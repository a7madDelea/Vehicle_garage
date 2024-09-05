package vehicle;

public class Truck  extends Vehicle{

    // Variables.
    private double cargoCapacity;

    // Constructor.
    public Truck(String ownerName, String brand, String model, int year , double cargoCapacity) {
        super(ownerName, brand, model, year);
        this.cargoCapacity=cargoCapacity;
    }

    // Setter cargo capacity method.
    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity=cargoCapacity;
    }

    // Getter cargo capacity method.
    public double getCargoCapacity() {
        return this.cargoCapacity;
    }

    // Show truck data function.
    @Override
    public void displayInfo() {
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Truck: " + getBrand() + " Model: " + getModel() + " Year: " + getYear());
        System.out.println("Cargo Capacity " + this.cargoCapacity);
    }

}
