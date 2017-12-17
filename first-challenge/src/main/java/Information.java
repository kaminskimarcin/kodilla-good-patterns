public class Information implements InformationProcess {

    @Override
    public boolean information(Provider provider) {
        System.out.println("Realization of order on products:");

        provider.getProductsList().entrySet().stream()
                .forEach(System.out::println);
        System.out.println("from " + provider.getProviderName() + " Completed");
        return true;
    }
}