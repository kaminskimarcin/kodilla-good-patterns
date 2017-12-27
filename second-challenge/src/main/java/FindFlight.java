import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindFlight {

    public List<Airport> findAllAvailableFlightFromAirport(FlyingList flyingList, Airport airport) {
        return flyingList.getListOfAvailableFlights().get(airport);
    }

    public List<Airport> findAllAvailableFlightToAirport(FlyingList flyingList, Airport airport) {
        List<Airport> fromToList = new ArrayList<>();

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
        List<Airport> destinationlist = new ArrayList<>();

        if (flyingList.getListOfAvailableFlights().get(departure).contains(arrival)) {
            System.out.println("Simple way! " + departure + " -> " + arrival);
        } else {
            flyingList.getListOfAvailableFlights().entrySet().stream()
                    .forEach(k -> {
                        if (k.getValue().contains(arrival)) {
                            destinationlist.add(k.getKey());
                            System.out.println("Your connect: " + departure + " -> " + k.getKey() + " -> " + arrival);
                        }
                    });
        }
        return destinationlist;
    }
}