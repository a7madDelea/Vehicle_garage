import java.util.Scanner;

import vehicle.Car;
import vehicle.Motorcycle;
import vehicle.Truck;

public class App {
    public static void main(String[] args) throws Exception {

        Garage garage = new Garage();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("Menue:");
            System.out.println("1. Add a vehicle.");
            System.out.println("2. Update a vehicle.");
            System.out.println("3. Remove a vehicle.");
            System.out.println("4. Display vehicles.");
            System.out.println("5. Display details of a vehicle.");
            System.out.println("0. Exit.");

            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:

                    System.out.println("Choose the vehicle type:");
                    System.out.println("1. Car.");
                    System.out.println("2. Motorcycle.");
                    System.out.println("3. Truck.");

                    System.out.print("Enter the vehicle (1 - 3): ");
                    int vehicleTypeChoice = scanner.nextInt();
                    scanner.nextLine();
                    switch (vehicleTypeChoice) {
                        case 1:

                            System.out.print("Enter owner name: ");
                            String carOwner = scanner.nextLine();
                            System.out.print("Enter car brand: ");
                            String carBrand = scanner.nextLine();
                            System.out.print("Enter car model: ");
                            String carModel = scanner.nextLine();
                            System.out.print("Enter car year: ");
                            int carYear = scanner.nextInt();
                            System.out.print("Enter seating capasity: ");
                            int seatingCapacity = scanner.nextInt();
                            scanner.nextLine();
                            garage.addVehicle(new Car(carOwner, carBrand, carModel, carYear, seatingCapacity));
                            break;

                        case 2:

                            System.out.print("Enter owner name: ");
                            String motorOwner = scanner.nextLine();
                            System.out.print("Enter motorcycle brand: ");
                            String motorBrand = scanner.nextLine();
                            System.out.print("Enter motorcycle model: ");
                            String motorModel = scanner.nextLine();
                            System.out.print("Enter motorcycle year: ");
                            int motorYear = scanner.nextInt();
                            System.out.print("Enter engine size: ");
                            int engineSize = scanner.nextInt();
                            scanner.nextLine();
                            garage.addVehicle(
                                    new Motorcycle(motorOwner, motorBrand, motorModel, motorYear, engineSize));
                            break;

                        case 3:

                            System.out.print("Enter owner name: ");
                            String truckOwner = scanner.nextLine();
                            System.out.print("Enter truck brand: ");
                            String truckBrand = scanner.nextLine();
                            System.out.print("Enter truck model: ");
                            String truckModel = scanner.nextLine();
                            System.out.print("Enter truck year: ");
                            int truckYear = scanner.nextInt();
                            System.out.print("Enter cargo capacity: ");
                            double cargoCapacity = scanner.nextDouble();
                            scanner.nextLine();
                            garage.addVehicle(new Truck(truckOwner, truckBrand, truckModel, truckYear, cargoCapacity));
                            break;

                        default:
                            System.out.println("Invalid vehicel type choice.");
                            break;
                    }
                    break;

                case 2:

                    System.out.print("Enter owner name of the vehicle to update: ");
                    String updateOwner = scanner.nextLine();
                    System.out.print("Enter new owner name: ");
                    String owner = scanner.nextLine();
                    System.out.print("Enter new vehicle brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter new vehicle model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter new vehicle year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    garage.updateVehicle(updateOwner, owner, brand, model, year);
                    break;

                case 3:

                    System.out.print("Enter owner name of a vehicle to remove: ");
                    String removeOwner = scanner.nextLine();
                    garage.removeVehicle(removeOwner);
                    break;

                case 4:

                    garage.displayVehicles();
                    break;

                case 5:

                    System.out.print("Enter owner name of the vehicle to display details: ");
                    String displayOwner = scanner.nextLine();
                    garage.displayVehicleDetails(displayOwner);
                    break;

                case 0:

                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 0);
    }
}
