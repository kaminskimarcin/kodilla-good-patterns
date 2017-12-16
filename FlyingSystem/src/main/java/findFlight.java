public class findFlight {

    public void findAllAvailableFlightFromAirport(FlyingList flyingList, String airport) {
        flyingList.getListOfAvailableFlights().entrySet().stream()
                .map(k -> k.getKey().equals(airport))
                .forEach(System.out::println);
    }

    public void findAllAvailableFlightToAirport(FlyingList flyingList, String airport) {
        flyingList.getListOfAvailableFlights().entrySet().stream()
                .map(k -> k.getValue().equals(airport))
                .forEach(System.out::println);
    }
}
