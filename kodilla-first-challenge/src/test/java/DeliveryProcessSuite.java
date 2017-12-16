import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DeliveryProcessSuite {

    @Test
    public void testInformation() {
        //Given
        Information information = new Information();

        InformationProcess informationProcess = information;

        Map<String, Integer> productsList = new HashMap<>();

        productsList.put("Milk", 10);

        Provider provider = new Provider("TestProvider", productsList);

        //When

        informationProcess.information(provider);
        String expectedOutput = "Realization of delivery on products: \nMilk=10\nfrom TestProvider Completed";


    }
}
