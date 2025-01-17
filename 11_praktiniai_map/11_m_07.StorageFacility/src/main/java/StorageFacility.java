import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StorageFacility {
    HashMap<String, ArrayList<String>> unitContents = new HashMap<>();

    public void add(String unit, String item) {
        if (!unitContents.containsKey(unit)) {
            ArrayList<String> items = new ArrayList<>();
            items.add(item);
            unitContents.put(unit, items);
        } else {
            unitContents.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (unitContents.containsKey(storageUnit)) {
            return unitContents.get(storageUnit);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String storageUnit, String item) {
        if (unitContents.containsKey(storageUnit)) {
            unitContents.get(storageUnit).remove(item);
            if (unitContents.get(storageUnit).isEmpty()) {
                unitContents.remove(storageUnit);
            }

        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitNames = new ArrayList<>();
        return (ArrayList<String>) unitContents.entrySet().stream().filter(entry -> !entry.getValue().isEmpty()).map(Map.Entry::getKey).collect(Collectors.toList());

    }
}