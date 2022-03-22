import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava
{
    public static void main(String[] arg) throws JsonProcessingException
    {
        ObjectMapper objectMapper = new ObjectMapper();

        String userJson = "{\"name\":\"John\",\"age\":21}";
        UserOne userObject = objectMapper.readValue(userJson, UserOne.class);

        System.out.println(userObject.getName()); // John
        System.out.println(userObject.getAge());  // 21
    }
}
