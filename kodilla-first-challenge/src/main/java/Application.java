import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        Provider freshFruits = new Provider("Fresh Fruits", new HashMap<>());
        Information information = new Information();

        Delivery delivery = new Delivery(freshFruits, information);

        delivery.Process();
    }
}
