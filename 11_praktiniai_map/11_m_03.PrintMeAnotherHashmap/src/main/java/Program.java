
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void printValues(HashMap<String, Book> hashmap){
        for (Map.Entry<String, Book> entry : hashmap.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text){
        for (Map.Entry<String, Book> entry : hashMap.entrySet()){
            if (entry.getValue().getName().contains(text)){
                System.out.println(entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Book> hashMap = new HashMap<>();
    }
}
