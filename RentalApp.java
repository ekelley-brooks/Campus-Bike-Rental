/** Client program for the campus bike rental system. */
public class RentalApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Campus Bike Rental System!");
        
        RentalStation r1 = new RentalStation("North Station");
        RentalStation r2 = new RentalStation("South Station");

        Bike b1 = new Bike(7252, "Mountain");
        Bike b2 = new Bike(5678, "Road");
        Bike b3 = new Bike(9876, "Electric");

        r1.rentBike(b2, r1);
        r1.rentBike(b2, r1);

        r2.rentBike(b3, r2);

        r1.returnBike(b2, r1);
        r1.rentBike(b2, r1);

        r2.rentBike(b1, r2);
        
        RentalStation.calculateCost(3);
        
        RentalStation.getTotalRentals();

    }
}

/*
PART D — Written Responses

1. Why is totalRentals static, but name is not?
Answer:Because name is specific to each station and totalRentals is not

2. What would happen if totalRentals were not static?
Answer: it would count the total rentals for each station

3. When rentBike(Bike bike) is called, is a new Bike object created? Explain.
Answer: no, it refrences the the bike object you specified to pull information
from or change the status of

4. Why is HOURLY_RATE declared final?
Answer: Cause it cannot not be changed. the price per hour is final
*/
