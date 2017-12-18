import java.util.Map;
import java.util.stream.Collectors;

public class ExtraFoodShop extends Deliverer implements Provider {
    public ExtraFoodShop(String name, Map<String, Integer> productsList, int minDaysaysToRealizeOrder) {
        super(name, productsList, minDaysaysToRealizeOrder);
    }

    @Override
    public Map<String, Integer> process(DeliverRequest deliverRequest) {
        boolean isPossibleToDeliverOrder = deliverRequest.getTimeToDeliverOrder() < getDaysToRealizeOrder();

        if (isPossibleToDeliverOrder) {
            Map<String, Integer> order = deliverRequest.getListOfOrderedProducts().entrySet().stream()
                    .filter(e -> getProductsList().entrySet().contains(e.getKey()))
                    .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
            return order;
        }
        return null;
    }

}
