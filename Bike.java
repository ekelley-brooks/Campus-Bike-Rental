/** Represents one bike in the campus rental system. */
public class Bike {
    private int id;
    private String model;
    public boolean isAvailable;

    public Bike(int id, String model) {
        id = this.id;
        model = this.model;
        isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        
    }

    public void returnBike() {
    
    }
}
