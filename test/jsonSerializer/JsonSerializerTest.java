package jsonSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import static jsonSerializer.Sex.MALE;
import static jsonSerializer.Sex.SHIM;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class JsonSerializerTest {
//    private Logger logger = Logger.getLogger(JsonSerializerTest.class);
    @Test
    public void testSerialize(){
        Person person = new Person("Aramide", "2024-03-03", "09083373838", SHIM);
//        person.setName("Aramide");
//        String dateOfBirth = "2024-03-03";
//        person.setDateOfBirth(dateOfBirth);
//        person.setGender(SHIM);
//        person.setPhoneNumber("09083373838");

        String json = JsonSerializer.serialize(person);
        String expected = "{\"name\":\"Aramide\",\"phoneNumber\":\"09083373838\",\"gender\":\"SHIM\",\"dob\":\"2024-03-03\"}";
        assertEquals(expected, json);
    }

    @Test
    public void testDeserialize() throws JsonProcessingException {
        Person person = new Person("John", "2024-02-10", "08144331122", MALE);
        String json = JsonSerializer.serialize(person);
        Person personFromJson = JsonSerializer.deserialize(json);
        System.out.println("Person from json: " + personFromJson);

        assertNotNull(personFromJson);
        assertEquals(person.getDateOfBirth(), personFromJson.getDateOfBirth());
        assertEquals(MALE, personFromJson.getGender());
        assertEquals("John", personFromJson.getName());
        assertEquals("08144331122", personFromJson.getPhoneNumber());
    }


}
