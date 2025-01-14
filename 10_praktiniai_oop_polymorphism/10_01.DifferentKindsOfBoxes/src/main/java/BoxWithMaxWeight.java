import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BoxWithMaxWeight extends Box {

    private List<Item> items;
    private int capacity;


    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }


    @Override
    public void add(Item item) {
        int weight = 0;
        for (Item itemInBox : items) {
            weight += itemInBox.getWeight();
        }
        if (weight + item.getWeight() <= capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
