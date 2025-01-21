public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        addToWarehouse(initialBalance);

    }

    public String history() {
        return changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        changeHistory.add(getBalance() + amount);
        super.addToWarehouse(amount);

    }

    @Override
    public double takeFromWarehouse(double amount) {
        changeHistory.add(getBalance() - amount);
        return super.takeFromWarehouse(amount);
    }


    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\nHistory: " + changeHistory.toString() + " \nLargest amount of product: " + changeHistory.maxValue() + " \nSmallest amount of product: " + changeHistory.minValue() + "\nAverage: " + changeHistory.average());
    }
}
