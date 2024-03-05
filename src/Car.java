public class Car extends Vehicle {
    private int numberOfDoors;
    public Car (String producer, String modell, int year, double rentalFee, int numberOfDoors) {
        super(producer,modell,year,rentalFee);
        this.numberOfDoors = numberOfDoors;
    };
}