package dietel_c14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataValidatorTest {

    @Test
    public void testValidatorPhoneNumber(){
        String phoneNumber = "";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isValidPhoneNumber);
    }

    @Test
    public void testValidatorPhoneNumber2(){
        String phoneNumber = "09035067809";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isValidPhoneNumber);
    }

    @Test
    public void testValidatorPhoneNumber3(){
        String phoneNumber = "2349034345433";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isValidPhoneNumber);
    }

    @Test
    public void testValidatorPhoneNumber4(){
        String phoneNumber = "+2349034345433434";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isValidPhoneNumber);
    }

    @Test
    public void testValidatorPhoneNumber5(){
        String phoneNumber = "+2349034345433";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isValidPhoneNumber);
    }

    @Test
    public void testValidatorPhoneNumber6(){
        String phoneNumber = "2347182838383";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isValidPhoneNumber);
    }

    @Test
    public void testValidatorPhoneNumber7(){
        String phoneNumber = "234718283A383";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isValidPhoneNumber);
    }

    @Test
    public void testValidatorPhoneNumber8(){
        String phoneNumber = "718283A383";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isValidPhoneNumber);
    }

    @Test
    public void testValidatorEmailAddress(){
        String emailAddress = "lawaltoheeb36@gmail.com";
        boolean isValidEmailAddress = DataValidator.isEmailValid(emailAddress);
        assertTrue(isValidEmailAddress);
    }

}