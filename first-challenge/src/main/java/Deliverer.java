import java.util.Map;

public class Deliverer {
    private String name;
    private Map<String, Integer> productsList;
    private int minDaysaysToRealizeOrder;

    public Deliverer(String name, Map<String, Integer> productsList, int daysToRealizeOrder) {
        this.name = name;
        this.productsList = productsList;
        minDaysaysToRealizeOrder = daysToRealizeOrder;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getProductsList() {
        return productsList;
    }

    public int getDaysToRealizeOrder() {
        return minDaysaysToRealizeOrder;
    }

    public void displayProductsList() {
        getProductsList().entrySet().stream()
                .forEach(System.out::println);
    }
}
