public class Truck extends Vehicle{
    private double loadCapacity;
    public Truck (String producer, String modell, int year, double rentalFee, int loadCapacity) {
        super(producer,modell,year,rentalFee);
        this.loadCapacity = loadCapacity;
    };
}