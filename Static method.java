public class Vehicle {
    static int count = 0; // Static variable to keep track of total vehicles

    int vehicleID;
    String brandName;
    double price;

    // Constructor
    Vehicle(String brandName, double price) {
        count++; // Increment vehicle count
        this.vehicleID = count; // Auto-assign ID
        this.brandName = brandName;
        this.price = price;
    }

    // Method to display vehicle details
    void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Price: $" + price);
    }

    // Static method to display total number of vehicles
    static void displayVehicleCount() {
        System.out.println("Total Vehicles Created: " + count);
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("BMW", 55000);
        Vehicle v2 = new Vehicle("Audi", 60000);

        v1.displayDetails();
        System.out.println();
        v2.displayDetails();
        System.out.println();

        Vehicle.displayVehicleCount();
    }
}

