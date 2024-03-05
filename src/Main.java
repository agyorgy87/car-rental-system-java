//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RentalSystem rentalSystem = new RentalSystem();

        Car fordMustang = new Car ("Ford", "Mustang", 1967, 500, 3);
        Truck mercedesAtego = new Truck("Mercedes", "Atego", 2006, 100, 400);
        Motorcycle suzukiGsx = new Motorcycle("Suzuki", "GSX", 2006, 200, 750);

        //add vehicle
        rentalSystem.addNewVehicle(fordMustang);
        rentalSystem.addNewVehicle(mercedesAtego);
        rentalSystem.addNewVehicle(suzukiGsx);

        //available vehicles
        //rentalSystem.availableVehicles();
        //rentalSystem.allVehicleNumber();

        //rental vehicel
        rentalSystem.rentVehicle("Mercedes", "Atego");
        rentalSystem.rentVehicle("Suzuki", "GSX");
        rentalSystem.rentedVehicles();

        //rentalSystem.availableVehicles();

        //return vehicle
        rentalSystem.returnVehicle("Mercedes", "Atego");
        rentalSystem.returnVehicle("Mercedes", "Atego");

        //renting a non-existent vehicle
        rentalSystem.rentVehicle("Audi", "A8");
        //returning a non-existent vehicle
        rentalSystem.returnVehicle("Opel", "Corsa");

        //rentalSystem.availableVehicles();
        //rentalSystem.availableVehiclesNumber();

        //rentalSystem.rentedVehicles();
        //rentalSystem.rentedVehiclesNumber();

    }
}