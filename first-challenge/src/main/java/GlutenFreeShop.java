import java.util.Map;

public class GlutenFreeShop extends Deliverer implements Provider{

    public GlutenFreeShop(String name, Map<String, Integer> productsList, int minDaysaysToRealizeOrder) {
        super(name, productsList, minDaysaysToRealizeOrder);
    }

    @Override
    public void process(Deliverer deliverer, DeliverRequest deliverRequest) {

    }
}
