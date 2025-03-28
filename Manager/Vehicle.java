import java.util.ArrayList;

public abstract class Vehicle {
    public static ArrayList<String>  getVehicles() {
        ArrayList<String> vehicles = new ArrayList<>();
        vehicles.add("Boat#general");
        vehicles.add("Car#horror#scifi#mystery");
        vehicles.add("Truck#horror#scifi#mystery");
        vehicles.add("Submarine#horror#scifi#mystery");
        vehicles.add("Airplane#horror#scifi#mystery");
        vehicles.add("Bike#horror#scifi#mystery");
        vehicles.add("Spaceship#horror#scifi");
        vehicles.add("Horse#general");
        vehicles.add("Pegasus#fantasy");
        vehicles.add("Phoenix#fantasy");
        vehicles.add("Dragon#fantasy");
        return vehicles;
    }
}
