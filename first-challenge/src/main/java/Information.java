public class Information implements InformationProcess {

    @Override
    public boolean information(DeliverRequest deliverRequest) {
        System.out.println("Realization of order on products:");

        deliverRequest.getListOfOrderedProducts().entrySet().stream()
                .forEach(System.out::println);
        System.out.println("from " + deliverRequest.getDeliverer().getName() + " Completed");
        return true;
    }
}