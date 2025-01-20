public class ProductWarehouseWithHistory extends ProductWarehouse {

    private double initialBalance;

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);

        addToWarehouse(initialBalance);
        changeHistory = new ChangeHistory();

    }

    public String history() {
        return super.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());


    }

    public double takeFromTheWarehouse(double amount) {
        super.takeFromWarehouse(amount);

    }
}
