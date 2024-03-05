public class Motorcycle extends Vehicle{
    private int engineSize;
    public Motorcycle (String producer, String modell, int year, double rentalFee, int engineSize) {
        super(producer,modell,year,rentalFee);
        this.engineSize = engineSize;
    };
}