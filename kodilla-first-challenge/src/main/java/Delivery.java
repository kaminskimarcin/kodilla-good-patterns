import java.time.LocalDate;

public class Delivery implements DeliveryProcess {
    private Provider provider;
    private InformationProcess informationProcess;

    public Delivery(Provider provider, InformationProcess informationProcess) {
        this.provider = provider;
        this.informationProcess = informationProcess;
    }

    @Override
    public void Process() {
        System.out.println("Provider name: " + provider.getProviderName());
        System.out.println("Products from this provider: " + provider.getProductsList());
        System.out.println("Realization delivery...");
        System.out.println("Date of delivery: " + LocalDate.now().plusDays(2));

        informationProcess.information(provider);
    }
}
