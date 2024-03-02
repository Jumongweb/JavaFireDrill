import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GeopoliticalZoneTest {

    @Test
    public void testThatOyoIsInSouthWest(){
        GeopoliticalZones geopoliticalZones = GeopoliticalZones.NORTH_CENTRAL;
        String actual = "Oyo";
        assertEquals(GeopoliticalZones.SOUTH_WEST, geopoliticalZones.getZone(actual));
    }

    @Test
    public void testThatAbiaIsInSouthEast(){
        GeopoliticalZones geopoliticalZones = GeopoliticalZones.NORTH_CENTRAL;
        String actual = "Abia";
        assertEquals(GeopoliticalZones.SOUTH_EAST, geopoliticalZones.getZone(actual));
    }

    @Test
    public void testThatAbiaIsInNorthCentral(){
        GeopoliticalZones geopoliticalZones = GeopoliticalZones.NORTH_CENTRAL;
        String actual = "F.c.t";
        assertEquals(GeopoliticalZones.NORTH_CENTRAL, geopoliticalZones.getZone(actual));
    }

    @Test
    public void testThatAbiaIsInSouthSouth(){
        GeopoliticalZones geopoliticalZones = GeopoliticalZones.NORTH_CENTRAL;
        String actual = "River";
        assertEquals(GeopoliticalZones.SOUTH_SOUTH, geopoliticalZones.getZone(actual));
    }
    @Test
    public void testThatBauchiIsInNorthEast(){
        GeopoliticalZones geopoliticalZones = GeopoliticalZones.NORTH_CENTRAL;
        String actual = "Bauchi";
        assertEquals(GeopoliticalZones.NORTH_EAST, geopoliticalZones.getZone(actual));
    }

    @Test
    public void testThatKanoIsInNorthWest(){
        GeopoliticalZones geopoliticalZones = GeopoliticalZones.NORTH_CENTRAL;
        assertEquals(GeopoliticalZones.NORTH_WEST, geopoliticalZones.getZone("kano"));
    }

}