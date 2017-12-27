import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindFlight {

    public List<Airport> findAllAvailableFlightFromAirport(FlyingList flyingList, Airport airport) {
        return flyingList.getListOfAvailableFlights().get(airport);
    }

    public List<Airport> findAllAvailableFlightToAirport(FlyingList flyingList, Airport airport) {
        List<Airport> fromToList = new ArrayList<>();
        for (Map.Entry<Airport, List<Airport>> airportList : flyingList.getListOfAvailableFlights().entrySet()) {
            if (airportList.getValue().contains(airport)) {
                fromToList.add(airportList.getKey());
            }
        }

        flyingList.getListOfAvailableFlights().entrySet().stream()
                .forEach(k -> {
                            if (k.getValue().contains(airport)) {
                                fromToList.add(k.getKey());
                            }
                        }
                );
        return fromToList;
    }

    public List<Airport> findAllAvaiableConnectsFromTo(FlyingList flyingList, Airport departure, Airport arrival) {
        return null;
    }
}