import java.util.Map;

public class DeliverRequest {
    private int timeToDeliverOrder;
    private Deliverer deliverer;
    private Map<String, Integer> listOfOrderedProducts;

    public DeliverRequest(int timeToDeliverOrder, Deliverer deliverer, Map<String, Integer> listOfOrderedProducts) {
        this.timeToDeliverOrder = timeToDeliverOrder;
        this.deliverer = deliverer;
        this.listOfOrderedProducts = listOfOrderedProducts;
    }

    public int getTimeToDeliverOrder() {
        return timeToDeliverOrder;
    }

    public Deliverer getDeliverer() {
        return deliverer;
    }

    public Map<String, Integer> getListOfOrderedProducts() {
        return listOfOrderedProducts;
    }
}
