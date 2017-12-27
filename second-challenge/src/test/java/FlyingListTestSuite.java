import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class FlyingListTestSuite {
    @Test
    public void shouldReturnArrivalList() {
        //Given
        Airport wro = new Airport("Wrocław");
        Airport kat = new Airport("Katowice");
        Airport kra = new Airport("Kraków");
        Airport war = new Airport("Warszawa");

        List<Airport> airportsList = new ArrayList<>();

        airportsList.add(kat);
        airportsList.add(kra);
        airportsList.add(war);

        Map<Airport, List<Airport>> fromToMap = new HashMap<>();

        fromToMap.put(wro, airportsList);

        FlyingList flyingList = new FlyingList(fromToMap);

        FindFlight findFlight = new FindFlight();


        //When

        List<Airport> airportList = findFlight.findAllAvailableFlightFromAirport(flyingList, wro);

        List<Airport> expectedList = new ArrayList<>(Arrays.asList(kat, kra, war));

        //Then

        Assert.assertEquals(expectedList, airportList);
    }

    @Test
    public void shouldReturnToFromList() {
        //Given
        Airport wro = new Airport("Wrocław");
        Airport kat = new Airport("Katowice");
        Airport kra = new Airport("Kraków");
        Airport war = new Airport("Warszawa");

        List<Airport> flightsFromWroTo = new ArrayList<>();
        List<Airport> flightsFromWarTo = new ArrayList<>();
        List<Airport> flightsFromKraTo = new ArrayList<>();

        flightsFromWarTo.add(kat);
        flightsFromWarTo.add(kra);
        flightsFromWarTo.add(wro);

        flightsFromKraTo.add(wro);
        flightsFromKraTo.add(war);
        flightsFromKraTo.add(kat);

        flightsFromWroTo.add(kat);
        flightsFromWroTo.add(kra);
        flightsFromWroTo.add(war);

        Map<Airport, List<Airport>> flightsTo = new HashMap<>();

        flightsTo.put(wro, flightsFromWroTo);
        flightsTo.put(war, flightsFromWarTo);
        flightsTo.put(kra, flightsFromKraTo);

        FindFlight findFlight = new FindFlight();

        FlyingList flyingList = new FlyingList(flightsTo);

        //When

        List<Airport> list = findFlight.findAllAvailableFlightToAirport(flyingList, wro);
        List<Airport> expectedList = new ArrayList<>(Arrays.asList(war, kra));

        //Then

        Assert.assertEquals(expectedList, list);
    }

    @Test
    public void shouldReturnDestinationList() {
        //Given
        Airport wro = new Airport("Wrocław");
        Airport kat = new Airport("Katowice");
        Airport kra = new Airport("Kraków");
        Airport war = new Airport("Warszawa");

        List<Airport> flightsFromWroTo = new ArrayList<>();
        List<Airport> flightsFromWarTo = new ArrayList<>();
        List<Airport> flightsFromKraTo = new ArrayList<>();
        List<Airport> flightsFromKatTo = new ArrayList<>();

        flightsFromWarTo.add(kat);
        flightsFromWarTo.add(kra);
        flightsFromWarTo.add(wro);

        flightsFromKraTo.add(wro);
        flightsFromKraTo.add(war);
        flightsFromKraTo.add(kat);

        flightsFromWroTo.add(kat);
        flightsFromWroTo.add(war);

        flightsFromKatTo.add(war);
        flightsFromKatTo.add(wro);
        flightsFromKatTo.add(kra);

        Map<Airport, List<Airport>> flightsTo = new HashMap<>();

        flightsTo.put(wro, flightsFromWroTo);
        flightsTo.put(war, flightsFromWarTo);
        flightsTo.put(kra, flightsFromKraTo);
        flightsTo.put(kat, flightsFromKatTo);

        FindFlight findFlight = new FindFlight();

        FlyingList flyingList = new FlyingList(flightsTo);

        //When

        List<Airport> destination = findFlight.findAllAvaiableConnectsFromTo(flyingList, wro, kra);

        //Then

        Assert.assertEquals(2, destination.size());

    }
}
