import java.util.ArrayList;

public class Box implements Packable {

    private double weight;

    private ArrayList<Packable> items;

    public Box(double weight) {
        this.items = new ArrayList<>();
        this.weight = weight;
    }


    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : items) {
           totalWeight += item.weight();
        }
        return totalWeight;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= weight){
                items.add(item);
            }
        }

    public int counter(){
        int counter = 0;
        for (Packable items : items){
            counter++;
        }
        return counter;
    }

    public String toString() {
        return "Box: " + counter () + " items, " + "total weight " + weight() + " kg";
    }
}
