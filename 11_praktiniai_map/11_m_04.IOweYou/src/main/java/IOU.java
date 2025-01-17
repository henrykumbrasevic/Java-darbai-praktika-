import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> iOweYou;

    public IOU() {
        this.iOweYou = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        iOweYou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (iOweYou.containsKey(toWhom)) {
            return iOweYou.get(toWhom);
        } else {
            return 0;
        }
    }
}
