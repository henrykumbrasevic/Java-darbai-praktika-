import lt.techin.philatelist.PostStamp;

import java.util.Comparator;

public class StampComporator implements Comparator<PostStamp> {

    @Override
    public int compare(PostStamp name1, PostStamp name2) {
        return name1.getName().compareTo(name2.getName());
    }
}
