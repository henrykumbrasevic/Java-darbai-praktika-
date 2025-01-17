
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void printKeys(HashMap<String, String> hashMap) {
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String key : hashMap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) {
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

    }
}
