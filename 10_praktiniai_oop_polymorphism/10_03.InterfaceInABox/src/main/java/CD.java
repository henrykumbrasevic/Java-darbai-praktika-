import java.util.ArrayList;

public class CD implements Packable{


    private String artist;
    private String cdName;
    private int publicationYear;

    public CD (String artist, String cdName, int publicationYear){
        this.artist = artist;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return artist + ": " + cdName + " (" + publicationYear + ")";
    }
    @Override
    public double weight() {
        return 0.1;
    }

}
