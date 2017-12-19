import java.util.Map;

public class HealthyShop extends Deliverer implements Provider {
    public HealthyShop(String name, Map<String, Integer> productsList, int minDaysaysToRealizeOrder) {
        super(name, productsList, minDaysaysToRealizeOrder);
    }

    @Override
    public void process(DeliverRequest deliverRequest) {
        boolean isPossibleToDeliverOrder = deliverRequest.getTimeToDeliverOrder() < getDaysToRealizeOrder();

        if (isPossibleToDeliverOrder) {
            System.out.println("Accepting order...");
            System.out.println("Checking available products in data base");
            System.out.println("Completing the order...");
            System.out.println("Checking available cars...");
            System.out.println("Transfer order to transport");
        }
    }
}