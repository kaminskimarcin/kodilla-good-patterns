import java.util.Map;
import java.util.Objects;

public class FlyingList {
    private Map<String, String> listOfAvailableFlights;

    public FlyingList() {
        this.listOfAvailableFlights = listOfAvailableFlights;
    }

    public void addFlight(String departureAirport, String arrivalAirport) {
        listOfAvailableFlights.put(departureAirport, arrivalAirport);
    }

    public void displayAvaiableFlight() {
        listOfAvailableFlights.entrySet().stream()
                .forEach(System.out::println);
    }

    public Map<String, String> getListOfAvailableFlights() {
        return listOfAvailableFlights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyingList that = (FlyingList) o;
        return Objects.equals(listOfAvailableFlights, that.listOfAvailableFlights);
    }

    @Override
    public int hashCode() {

        return Objects.hash(listOfAvailableFlights);
    }
}
