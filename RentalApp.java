/** Client program for the campus bike rental system. */
public class RentalApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Campus Bike Rental System!");
        
        RentalStation r1 = new RentalStation("North");
        RentalStation r2 = new RentalStation("South");

        Bike b1 = new Bike(7252, "Mountain");
        Bike b2 = new Bike(5678, "Road");
        Bike b3 = new Bike(9876, "E-Bike");

        r1.rentBike(b2);
        r1.rentBike(b2);

        r2.rentBike(b3);

        r1.returnBike(b2);
        r1.rentBike(b2);
        
        r1.calculateCost(3);
        
        RentalStation.getTotalRentals();

    }
}

/*
PART D — Written Responses

1. Why is totalRentals static, but name is not?
Answer:

2. What would happen if totalRentals were not static?
Answer:

3. When rentBike(Bike bike) is called, is a new Bike object created? Explain.
Answer:

4. Why is HOURLY_RATE declared final?
Answer:
*/
