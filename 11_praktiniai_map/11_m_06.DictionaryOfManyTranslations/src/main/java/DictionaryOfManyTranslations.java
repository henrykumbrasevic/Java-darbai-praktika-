import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)){
        ArrayList<String> translations = new ArrayList<>();
        translations.add(translation);
            dictionary.put(word, translations);
        } else {
            dictionary.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String word) {
        dictionary.remove(word);
    }
}