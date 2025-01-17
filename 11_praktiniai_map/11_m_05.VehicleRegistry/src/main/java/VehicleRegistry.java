import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicleOwner;

    public VehicleRegistry() {

        vehicleOwner = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!vehicleOwner.containsKey(licensePlate)) {
            vehicleOwner.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        return vehicleOwner.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehicleOwner.containsKey(licensePlate)) {
            vehicleOwner.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        vehicleOwner.keySet().forEach(System.out::println);
    }

    public void printOwners() {
        vehicleOwner.values().stream().distinct().forEach(System.out::println);
       }
    }



