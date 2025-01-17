import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> abbrevs;

    public Abbreviations() {
        this.abbrevs = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbrevs.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbrevs.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
      return abbrevs.get(abbreviation);
    }
}

