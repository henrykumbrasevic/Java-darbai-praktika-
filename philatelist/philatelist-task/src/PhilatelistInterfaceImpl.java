import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PhilatelistInterfaceImpl implements Philatelist {

    ArrayList<PostStamp> postStamps = new ArrayList<>();

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null) {
            throw new IllegalArgumentException();
        }
        if (postStamp.getName() == null){
            throw new IllegalArgumentException();
        }
        if (postStamp.getName().isEmpty()){
            throw new IllegalArgumentException();
        }
        if (!postStamps.contains(postStamp)){
            postStamps.add(postStamp);
        }
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        int numOfPostStamps = 0;
        for (PostStamp postStamp : postStamps) {
            numOfPostStamps++;
        }
        return numOfPostStamps;

    }

    @Override
    public void printAllPostStampNames() {
        for (PostStamp postStamp : postStamps) {
            System.out.println(postStamp.getName());
        }
    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double v) {
        for (PostStamp postStamp : postStamps) {
            if (postStamp.getMarketPrice() > v) {
                System.out.println(postStamp.getName());
            }
        }
    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) {
        for (PostStamp postStamp1 : postStamps) {
            if (postStamp1.equals(postStamp)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isPostStampWithNameInCollection(String s) {
        for (PostStamp postStamp : postStamps) {
            if (s == postStamp.getName()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double calculateTotalMarketPrice() {
        double total = 0;
        for (PostStamp postStamp : postStamps) {
            total += postStamp.getMarketPrice();
        }
        return total;
    }

    @Override
    public double getAveragePostStampPrice() {
        double total = 0;
        int counter = 0;
        for (PostStamp postStamp : postStamps) {
            counter++;
            total += postStamp.getMarketPrice();
        }
        return total = total / counter;
    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue() {
        double value = 0;
        PostStamp mostExpensivePostStamp = null;
        for (PostStamp postStamp : postStamps) {
            if (postStamp.getMarketPrice() > value) {
                value = postStamp.getMarketPrice();
                mostExpensivePostStamp = postStamp;
            }
        }
        return mostExpensivePostStamp;
    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String s) {
        List<PostStamp> containsString = new ArrayList<>();
        for (PostStamp postStamp : postStamps) {
            if (postStamp.getName().contains(s)) {
                containsString.add(postStamp);
            }
        }
        return containsString;
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {
        postStamps.sort(new Comparator<PostStamp>() {
            @Override
            public int compare(PostStamp name1, PostStamp name2) {
                return name1.getName().compareTo(name2.getName());
            }
        });
        return postStamps;
    }
}
