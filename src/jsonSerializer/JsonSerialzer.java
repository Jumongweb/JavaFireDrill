package jsonSerializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerialzer {

    public static String serializer( Person person){
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(person);
            return json;
        } catch ( Exception exception ){
            System.err.println(exception.getMessage());
            throw new RuntimeException(exception);
        }
    }

}
