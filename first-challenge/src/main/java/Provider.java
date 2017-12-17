import java.util.Map;

public class Provider {
    private String providerName;
    private Map<String, Integer> productsList;

    public Provider(String providerName, Map<String, Integer> productsList) {
        this.providerName = providerName;
        this.productsList = productsList;
    }

    public String getProviderName() {
        return providerName;
    }

    public Map<String, Integer> getProductsList() {
        return productsList;
    }
}