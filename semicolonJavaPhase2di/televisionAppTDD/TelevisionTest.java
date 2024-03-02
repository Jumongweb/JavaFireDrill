package semicolonJavaPhase2di.televisionAppTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    private Television television;

    @BeforeEach
    public void initializeTelevision(){
        television = new Television();
    }

    @Test
    public void testThatTelevisionIsOff_TurnItOnAndItIsOn(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
    }

    @Test
    public void testThatTelevisionIsOn_TurnItOffAndItIsOff(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        television.toggle();
        assertFalse(television.getTelevisionState());
    }

    @Test
    public void testThatTelevisionVolumeCanIncreaseVolume(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(0, television.getVolume());

        television.volumeUp();
        assertEquals(1, television.getVolume());

    }

    @Test
    public void testThatTelevisionVolumeIs6_IncreaseTo7(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(0, television.getVolume());

        for (int count = 0; count < 6; count++){
            television.volumeUp();
        }
        assertEquals(6, television.getVolume());
        television.volumeUp();

        assertEquals(7, television.getVolume());
    }

    @Test
    public void testThatTelevisionCanDecreaseVolume(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(0, television.getVolume());

        television.volumeUp();
        television.volumeUp();
        assertEquals(2, television.getVolume());

        television.volumeDown();
        assertEquals(1, television.getVolume());


    }

    @Test
    public void testThatTelevisionVolumeCannotIncreaseBeyond10(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(0, television.getVolume());

        for (int count = 0; count < 10; count++){
            television.volumeUp();
        }
        assertEquals(10, television.getVolume());

        television.volumeUp();
        assertEquals(10, television.getVolume());
    }



    @Test
    public void testThatTelevisionVolumeCannotdecreaseBelowZero(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(0, television.getVolume());

        television.volumeUp();
        television.volumeUp();
        assertEquals(2, television.getVolume());

        television.volumeDown();
        television.volumeDown();
        assertEquals(0, television.getVolume());
    }



   @Test
   public void testThatTelevisionVolumeCannotIncreaseWhenItIsOff(){
       assertFalse(television.getTelevisionState());
       television.toggle();
       assertTrue(television.getTelevisionState());
       assertEquals(0, television.getVolume());

       television.volumeUp();
       television.volumeUp();
       assertEquals(2, television.getVolume());
       television.toggle();

       television.volumeUp();
       assertEquals(2, television.getVolume());
   }

    @Test
    public void testThatTelevisionVolumeCannotReduceWhenItIsOff(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(0, television.getVolume());

        television.volumeUp();
        television.volumeUp();
        assertEquals(2, television.getVolume());
        television.toggle();

        television.volumeDown();
        assertEquals(2, television.getVolume());
    }

    @Test
    public void testThatTelevisionCanSwitchChannelUpward(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(1, television.getChannel());

        television.switchChannelUpward();
        assertEquals(2, television.getChannel());

    }

    @Test
    public void testThatTelevisionCanSwitchChannelDownward(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(1, television.getChannel());

        television.switchChannelUpward();
        television.switchChannelUpward();
        assertEquals(3, television.getChannel());

        television.switchChannelDownward();
        assertEquals(2, television.getChannel());
    }

    @Test
    public void testThatTelevisionCanCannotChangeChannelWhenItIsOff(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(1, television.getChannel());

        television.switchChannelUpward();
        television.switchChannelUpward();
        assertEquals(3, television.getChannel());

        television.toggle();
        television.switchChannelDownward();
        assertEquals(3, television.getChannel());
    }

    @Test
    public void testThatTelevisionCanIncreaseBrightness(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(0, television.getBrightness());

        television.increaseBrightness();
        television.increaseBrightness();
        assertEquals(2, television.getBrightness());

    }

    @Test
    public void testThatTelevisionCannotIncreaseBrightnessWhenItIsOff(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(0, television.getBrightness());

        television.increaseBrightness();
        television.increaseBrightness();
        assertEquals(2, television.getBrightness());

        television.toggle();
        television.increaseBrightness();
        assertEquals(2, television.getBrightness());
    }

    @Test
    public void testThatTelevisionCanDecreaseBrightness(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(0, television.getBrightness());

        television.increaseBrightness();
        television.increaseBrightness();
        assertEquals(2, television.getBrightness());

        television.decreaseBrightness();
        assertEquals(1, television.getBrightness());
    }

    @Test
    public void testThatTelevisionCannotIncreaseBrightnessBeyond10(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(0, television.getBrightness());

        for (int count = 0; count < 10; count++){
            television.increaseBrightness();
        }
        assertEquals(10, television.getBrightness());
        television.increaseBrightness();

        assertEquals(10, television.getBrightness());
    }

    @Test
    public void testThatTelevisionCannotDecreaseBrightnessBelowZero(){
        assertFalse(television.getTelevisionState());
        television.toggle();
        assertTrue(television.getTelevisionState());
        assertEquals(0, television.getBrightness());

        television.increaseBrightness();
        assertEquals(1, television.getBrightness());
        television.decreaseBrightness();
        assertEquals(0, television.getBrightness());

        television.decreaseBrightness();
        assertEquals(0, television.getBrightness());
    }



}
