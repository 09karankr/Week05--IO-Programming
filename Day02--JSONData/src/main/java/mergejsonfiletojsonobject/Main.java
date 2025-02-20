package mergejsonfiletojsonobject;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            // Read both JSON files
            String json1Str = new String(Files.readAllBytes(Paths.get("D:\\Week05\\Day02--JSONData\\src\\main\\resources\\file1.json")));
            String json2Str = new String(Files.readAllBytes(Paths.get("D:\\Week05\\Day02--JSONData\\src\\main\\resources\\file2.json")));

            // Convert to JSONObject
            JSONObject json1 = new JSONObject(json1Str);
            JSONObject json2 = new JSONObject(json2Str);

            // Merge JSON objects
            for (String key : json2.keySet()) {
                json1.put(key, json2.get(key));
            }

            // Print merged JSON
            System.out.println(json1.toString(4)); // Pretty print with 4 spaces
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
