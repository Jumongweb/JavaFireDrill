import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner airConditioner;

    @BeforeEach
    public void initializeAc(){
        airConditioner = new AirConditioner();
    }

    @Test
    public void testThatAirConditionerWillTurnOn(){
        assertFalse(airConditioner.getAirConditionerState());

        airConditioner.turnOn();
        assertTrue(airConditioner.getAirConditionerState());
    }

    @Test
    public void testThatAirConditionerWillTurnOff(){
        assertFalse(airConditioner.getAirConditionerState());

        airConditioner.turnOn();
        assertTrue(airConditioner.getAirConditionerState());

        airConditioner.turnOff();
        assertFalse(airConditioner.getAirConditionerState());
    }

    @Test
    public void testThatMyAirConditionerIncreaseTemperature(){
        assertFalse(airConditioner.getAirConditionerState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getAirConditionerState());
        assertEquals(16, airConditioner.getTemperature());

        airConditioner.increaseTemperature();
        assertEquals(17, airConditioner.getTemperature());
    }

    @Test
    public void testThatMyAirConditionerDoesNotIncreaseTemperatureWhenOff(){
        assertFalse(airConditioner.getAirConditionerState());

        airConditioner.increaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    public void testThatMyAirConditionerDoesNotDecreaseTemperatureWhenOff(){
        assertFalse(airConditioner.getAirConditionerState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getAirConditionerState());
        airConditioner.increaseTemperature();
        assertEquals(17, airConditioner.getTemperature());

        airConditioner.turnOff();
        assertFalse(airConditioner.getAirConditionerState());
        airConditioner.decreaseTemperature();
        assertEquals(17, airConditioner.getTemperature());
    }

    @Test
    public void testThatWhenToggledAcOnAndOff(){
        assertFalse(airConditioner.getAirConditionerState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getAirConditionerState());

        airConditioner.toggle();
        assertFalse(airConditioner.getAirConditionerState());
        airConditioner.toggle();
        assertTrue(airConditioner.getAirConditionerState());
    }

    @Test
    public void testThatMyAirConditionerDecreaseTemperature(){
    assertFalse(airConditioner.getAirConditionerState());
    airConditioner.turnOn();
        assertTrue(airConditioner.getAirConditionerState());
        assertEquals(16, airConditioner.getTemperature());
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        assertEquals(18, airConditioner.getTemperature());

        airConditioner.decreaseTemperature();
        assertEquals(17, airConditioner.getTemperature());
    }
    @Test
    public void testThatWhenTemperatureIsIncreaseAt30ItStaysAt30(){
        assertFalse(airConditioner.getAirConditionerState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getAirConditionerState());
        assertEquals(16, airConditioner.getTemperature());

        for (int count = 0; count < 14; count++){
            airConditioner.increaseTemperature();
        }
        assertEquals(30, airConditioner.getTemperature());
        airConditioner.increaseTemperature();
        assertEquals(30, airConditioner.getTemperature());
    }
    @Test
    public void testToSeeIfAcAt16StaysAt16WhenDecreased(){
        assertFalse(airConditioner.getAirConditionerState());
        airConditioner.turnOn();
        assertTrue(airConditioner.getAirConditionerState());
        assertEquals(16, airConditioner.getTemperature());

        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }
}
