import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", new HashMap<String, Integer>(), 2);
        HealthyShop healthyShop = new HealthyShop("Healthy Shop", new HashMap<String, Integer>(), 2);

        DeliverRequest deliverRequestFromExtraFoodShop = new DeliverRequest(3, extraFoodShop, new HashMap<String, Integer>());
        DeliverRequest deliverRequestFromHealthyShop = new DeliverRequest(5, healthyShop, new HashMap<String, Integer>());

        OrderExecutor orderExecutor = new OrderExecutor();

        orderExecutor.orderProcessor(deliverRequestFromExtraFoodShop, extraFoodShop);
        orderExecutor.orderProcessor(deliverRequestFromHealthyShop, healthyShop);

    }
}