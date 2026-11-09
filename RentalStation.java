/** A station that rents Bike objects. */
public class RentalStation {
    private static final double HOURLY_RATE = 8.0;
    private static int totalRentals = 0;
    private String stationName;

    public RentalStation(String name) {
        stationName = name;
    }

    public void rentBike(Bike bike) {
        if (bike.isAvailable()){
            bike.isAvailable = false;
            System.out.println("All set!");
        } else {
            System.out.println("This bike is not avalible");
        }
    }

    public void returnBike(Bike bike) {
        if (bike.isAvailable() == false){
            bike.isAvailable = true;
            totalRentals++;
            System.out.println("All set!");
        } else {
            System.out.println("This bike has already been returned");
        }
    }

    public double calculateCost(int hours) {
        return HOURLY_RATE * hours;
    }

    public static int getTotalRentals() {
        return totalRentals;
    }
}
