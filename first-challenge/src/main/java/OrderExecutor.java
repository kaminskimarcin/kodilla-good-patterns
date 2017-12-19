public class OrderExecutor {
    private Information information;

    public OrderExecutor() {
        this.information = new Information();
    }

    public void orderProcessor(DeliverRequest delivererRequest, Provider provider) {
        System.out.println("Name of provider: " + delivererRequest.getDeliverer().getName());
        System.out.println("List of ordered products: ");
        delivererRequest.getListOfOrderedProducts();
        provider.process(delivererRequest);
        information.information(delivererRequest);
    }
}

