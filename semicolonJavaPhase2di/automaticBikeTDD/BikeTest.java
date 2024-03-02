package semicolonJavaPhase2di.automaticBikeTDD;

import automaticBike.Bike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    private Bike bike;

    @BeforeEach
    public void initializeBike(){
        bike = new Bike();
    }

    @Test
    public void testBikeIsOff_TurnBikeOn_ItOn(){
        assertFalse(bike.getBikeCurrentState());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());
    }

    @Test
    public void testBikeIsOn_TurnsBikeOff(){
        assertFalse(bike.getBikeCurrentState());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());

        bike.toggleBike();
        assertFalse(bike.getBikeCurrentState());
    }

    @Test
    public void testThatBikeCanAccelerate(){
        assertFalse(bike.getBikeCurrentState());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());
        bike.getGear();
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
    }

    //@Test
    //public void testThatGear

    @Test
    public void testThatMyBikeIs15_AccelerateItIncrease(){
        assertFalse(bike.getBikeCurrentState());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());

        for (int count = 0; count < 15; count++){
            bike.accelerate();
        }
        assertEquals(15, bike.getSpeed());
        bike.accelerate();
        assertEquals(16, bike.getSpeed());
    }

    @Test
    public void testThatMyBikeDoesNotAccelerateWhenItIsOff(){
        assertFalse(bike.getBikeCurrentState());

        bike.accelerate();
        assertEquals(0, bike.getGear());
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void testThatSpeedIs24_AccelerateAndSpeedIs26(){
        assertFalse(bike.getBikeCurrentState());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());

        assertEquals(1, bike.getGear());
        assertEquals(0, bike.getSpeed());

        for (int count = 0; count < 20; count++){
            bike.accelerate();
        }
        assertEquals(20, bike.getSpeed());
        bike.accelerate();
        assertEquals(22, bike.getSpeed());
        bike.accelerate();
        assertEquals(2, bike.getGear());
        assertEquals(24, bike.getSpeed());

        bike.accelerate();
        assertEquals(26, bike.getSpeed());
    }

    @Test
    public void testThatGearIsOnSpeedIs35_AccelerateAndSpeedIs38(){
        assertFalse(bike.getBikeCurrentState());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());

        assertEquals(1, bike.getGear());
        assertEquals(0, bike.getSpeed());

        for (int count = 0; count < 26; count++){
            bike.accelerate();
        }
        assertEquals(32, bike.getSpeed());
        assertEquals(3, bike.getGear());
        bike.accelerate();
        assertEquals(35, bike.getSpeed());

        bike.accelerate();
        assertEquals(38, bike.getSpeed());
    }

    @Test
    public void testThatGearIs4AndSpeedIs44_AccelerateAndSpeedIs48(){
        assertFalse(bike.getBikeCurrentState());
        assertEquals(0, bike.getGear());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());
        assertEquals(0, bike.getSpeed());

        bike.setSpeed(44);
        assertEquals(44, bike.getSpeed());
        assertEquals(4, bike.getGear());
        assertEquals(44, bike.getSpeed());

        bike.accelerate();
        assertEquals(48, bike.getSpeed());
    }

    @Test
    public  void testThatMyBikeCanDecelerate(){
        assertFalse(bike.getBikeCurrentState());
        assertEquals(0, bike.getGear());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());
        assertEquals(0, bike.getSpeed());
        bike.accelerate();
        bike.accelerate();
        assertEquals(2, bike.getSpeed());
        bike.decelerate();
        assertEquals(1, bike.getSpeed());

    }

    @Test
    public  void testThatMyBikeIs15_DecelerateAndItBecomes14(){
        assertFalse(bike.getBikeCurrentState());
        assertEquals(0, bike.getGear());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());
        assertEquals(0, bike.getSpeed());
        for (int count = 0; count < 15; count++){
            bike.accelerate();
        }
        assertEquals(15, bike.getSpeed());
        bike.decelerate();
        assertEquals(14, bike.getSpeed());

    }

    //Intermission

    @Test
    public void testThatSpeedIs24_decelerateAndSpeedIs22(){
        assertFalse(bike.getBikeCurrentState());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());

        assertEquals(1, bike.getGear());
        assertEquals(0, bike.getSpeed());

        for (int count = 0; count < 20; count++){
            bike.accelerate();
        }
        assertEquals(20, bike.getSpeed());
        bike.accelerate();
        bike.accelerate();
        assertEquals(2, bike.getGear());
        assertEquals(24, bike.getSpeed());

        bike.decelerate();
        assertEquals(22, bike.getSpeed());
    }

    @Test
    public void testThatBikeIsAtGear3SpeedIs35_decelerateAndSpeedIs32(){
        assertFalse(bike.getBikeCurrentState());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());

        assertEquals(1, bike.getGear());
        assertEquals(0, bike.getSpeed());

        for (int count = 0; count < 27; count++){
            bike.accelerate();
        }

        assertEquals(35, bike.getSpeed());

        bike.decelerate();
        assertEquals(32, bike.getSpeed());
    }

    @Test
    public void testThatGearIs4AndSpeedIs44_decelerateAndSpeedIs40(){
        assertFalse(bike.getBikeCurrentState());
        assertEquals(0, bike.getGear());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());
        assertEquals(0, bike.getSpeed());

        bike.setSpeed(44);
        assertEquals(44, bike.getSpeed());
        assertEquals(4, bike.getGear());

        bike.decelerate();
        assertEquals(40, bike.getSpeed());
    }

    @Test
    public void testThatGearCannotGoBeyond4(){
        assertFalse(bike.getBikeCurrentState());
        assertEquals(0, bike.getGear());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());
        assertEquals(0, bike.getSpeed());

        bike.setSpeed(44);
        assertEquals(44, bike.getSpeed());
        assertEquals(4, bike.getGear());

        for (int count = 0; count < 20; count++){
            bike.accelerate();
        }
        assertEquals(124, bike.getSpeed());
        assertEquals(4, bike.getGear());
    }

    @Test
    public void testThatBikeDoNotDecelerateBelowZero(){
        assertFalse(bike.getBikeCurrentState());
        assertEquals(0, bike.getGear());
        bike.toggleBike();
        assertTrue(bike.getBikeCurrentState());
        assertEquals(0, bike.getSpeed());

        bike.accelerate();
        assertEquals(1, bike.getSpeed());
        bike.decelerate();
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }
}
