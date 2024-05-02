package jsonSerializer;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static jsonSerializer.Sex.SHIM;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonSerializerTest {
    @Test
    public void testSerialize(){
        Person person = new Person();
        person.setName("Aramide");
        String dateOfBirth = "2024-03-03";
        person.setDateOfBirth(dateOfBirth);
        person.setGender(SHIM);
        person.setPhoneNumber("09083373838");

        String json = JsonSerialzer.serializer(person);
        String expected = "{\"name\":\"Aramide\",\"dateOfBirth\":\"2024-03-03\",\"phoneNumber\":\"09083373838\",\"gender\":\"SHIM\"}";
        assertEquals(expected, json);
    }


}
