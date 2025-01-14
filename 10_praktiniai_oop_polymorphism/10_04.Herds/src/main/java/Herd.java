import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> items;

    public Herd() {
        items = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        items.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable item : items){
            item.move(dx, dy);
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable item : items) {
            result.append(item.toString()).append('\n');
        }
        return String.valueOf(result);
    }

}
