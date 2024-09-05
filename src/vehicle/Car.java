package vehicle;

public class Car extends Vehicle {

    // Variables.
    private int seatingCapacity;

    // Constructors.
    public Car(String ownerName, String brand, String model, int year, int seatingCapacity) {
        super(ownerName, brand, model, year);
        this.seatingCapacity = seatingCapacity;
    }

    // Setter seating capacity method.
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    // Getter seating capacity method.
    public int getSeatingCapacity() {
        return this.seatingCapacity;
    }

    // Show car data function.
    @Override
    public void displayInfo() {
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Car: " + getBrand() + " Model: " + getModel() + " Year: " + getYear());
        System.out.println("Seating Capacity: " + this.seatingCapacity);
    }

}
