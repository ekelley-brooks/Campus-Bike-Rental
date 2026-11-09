/** A station that rents Bike objects. */
public class RentalStation {
    private static final double HOURLY_RATE = 8.0;
    private static int totalRentals = 0;
    private String stationName;

    public RentalStation(String name) {
        stationName = name;
    }

    public String getName(){
        System.out.println("The name of this station is " + stationName);
        return stationName;
    }

    public void rentBike(Bike bike, RentalStation station) {
        if (bike.isAvailable()){
            bike.rent();
            totalRentals++;
            System.out.println(bike.getModel() + " bike, " +  bike.getId() + " rented from " + station.stationName +" Have fun on your ride!");
        } else {
            System.out.println(bike.getModel() + " bike, " +  bike.getId() + " is not avalible");
        }
    }

    public void returnBike(Bike bike, RentalStation station) {
        if (bike.isAvailable() == false){
            bike.returnBike();
            System.out.println(bike.getModel() + " bike, " +  bike.getId() + " returned to " + station.stationName);
        } else {
            System.out.println("This bike has already been returned");
        }
    }

    public double calculateCost(int hours) {
        System.out.println(hours + " hours costs $" + HOURLY_RATE * hours);
        return HOURLY_RATE * hours;
    }

    public static int getTotalRentals() {
        System.out.println("There have beeen " + totalRentals + " rentals total");
        return totalRentals;
    }
}
