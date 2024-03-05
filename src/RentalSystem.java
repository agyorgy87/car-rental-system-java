import java.util.LinkedList;
import java.util.List;

public class RentalSystem {

    private List<Vehicle> vehicles;

    public RentalSystem() {
        vehicles = new LinkedList<>();
    }

    public void addNewVehicle (Vehicle newVehicle) {
        vehicles.add(newVehicle);
        System.out.println("new vehicle added");
    }

    public void rentVehicle(String producer, String modell) {
        for (Vehicle currentVehicle : vehicles) {
            if (currentVehicle.producer.equals(producer) && currentVehicle.modell.equals(modell)) {
                if (!currentVehicle.currentlyRented) {
                    currentVehicle.renting();
                    System.out.println(currentVehicle.producer + " " + currentVehicle.modell + " type of vehicle rented.");
                }else{
                    System.out.println("This vehicle is currently rented.");
                }
                return;
            }
        }
        System.out.println("This type of vehicle does not exist in the system.");
    }

    public void returnVehicle (String producer, String modell) {
        for (Vehicle currentVehicle : vehicles) {
            if (currentVehicle.producer.equals(producer) && currentVehicle.modell.equals(modell)) {
                if (currentVehicle.currentlyRented) {
                    currentVehicle.bringBack();
                    System.out.println(currentVehicle.producer + " " + currentVehicle.modell + " type of vehicle brought back.");
                }else{
                    System.out.println("This vehicle was not rented.");
                }
                return;
            }
        }
        System.out.println("This type of vehicle does not exist in the system.");
    }

    public void availableVehicles () {
        System.out.println("available vehicles: ");
        for(Vehicle currentVehicle : vehicles) {
            if(!currentVehicle.currentlyRented) {
                System.out.println(currentVehicle.producer + " " + currentVehicle.modell);
            }
        }
    }

    public void rentedVehicles () {
        System.out.println("rented vehicles: ");
        for(Vehicle currentVehicle : vehicles) {
            if(currentVehicle.currentlyRented) {
                System.out.println(currentVehicle.producer + " " + currentVehicle.modell);
            }
        }
    }

    public void allVehicleNumber() {
        System.out.println("Number of all vehicles in the system: " + vehicles.size() + "db");
    }

    public void availableVehiclesNumber() {
        int numberOfCars = 0;
        for(Vehicle currentVehicle : vehicles) {
            if(!currentVehicle.currentlyRented) {
                numberOfCars++;
            }
        }
        System.out.println("Number of available vehicles: " + numberOfCars + "pc");
    }

    public void rentedVehiclesNumber() {
        int numberOfCars = 0;
        for(Vehicle currentVehicle : vehicles) {
            if(currentVehicle.currentlyRented) {
                numberOfCars++;
            }
        }
        System.out.println("number of rented vehicles: " + numberOfCars + "pc");
    }
}
