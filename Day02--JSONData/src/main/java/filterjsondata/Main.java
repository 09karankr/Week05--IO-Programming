package filterjsondata;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read JSON file into JsonNode
            JsonNode users = objectMapper.readTree(new File("D:\\Week05\\Day02--JSONData\\src\\main\\resources\\users.json"));

            // Iterate over users and print only those older than 25
            for (JsonNode user : users) {
                if (user.get("age").asInt() > 25) {
                    System.out.println(user);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}