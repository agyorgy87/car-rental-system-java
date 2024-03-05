public class Vehicle {
    String producer;
    String modell;
    int year;
    double rentalFee;
    boolean currentlyRented;

    public Vehicle (String producer, String modell, int year, double rentalFee) {
        this.producer = producer;
        this.modell = modell;
        this.year = year;
        this.rentalFee = rentalFee;
        this.currentlyRented = false;
    }

    public void renting () {
        if(!currentlyRented) {
            currentlyRented = true;
        }
    }

    public void bringBack () {
        if(currentlyRented) {
            currentlyRented = false;
        }
    }
}