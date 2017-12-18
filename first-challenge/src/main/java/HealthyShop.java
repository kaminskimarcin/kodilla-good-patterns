import java.util.Map;

public class HealthyShop extends Deliverer implements Provider{

    public HealthyShop(String name, Map<String, Integer> productsList, int minDaysaysToRealizeOrder) {
        super(name, productsList, minDaysaysToRealizeOrder);
    }

    @Override
    public void process(Deliverer deliverer, DeliverRequest deliverRequest) {

    }
}
