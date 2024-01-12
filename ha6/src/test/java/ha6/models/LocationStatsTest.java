package ha6.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationStatsTest {
    @Test
    @DisplayName("test to String from LocationStats.")
    void testToString() {


        LocationStats testStats = new io.javabrains.coronavirustracker.models.LocationStats();
        testStats.setState("Neukölln");
        testStats.setCountry("Germany");
        testStats.setLatestTotalCases(1997);
        String expected = "LocationStats{stats='Neukölln', country='Germany', latestTotalCases=1997}";
        String actual = testStats.toString();
        assertEquals(expected, actual);

    }
}
