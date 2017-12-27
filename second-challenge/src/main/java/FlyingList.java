
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FlyingList {
    private Map<Airport, List<Airport>> listOfAvailableFlights;

    public FlyingList(Map<Airport, List<Airport>> listOfAvailableFlights) {
        this.listOfAvailableFlights = listOfAvailableFlights;
    }

    public Map<Airport, List<Airport>> getListOfAvailableFlights() {
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