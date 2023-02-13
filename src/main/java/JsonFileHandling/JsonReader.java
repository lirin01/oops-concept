package JsonFileHandling;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonReader {
    public static void main(String[] args) throws ParseException ,IOException {
        JSONParser jsonparser=new JSONParser();
            JSONArray array =(JSONArray) jsonparser.parse(new FileReader("src/main/java/JsonFileHandling/write.json"));
            for(int i=0;i< array.size();i++){
                JSONObject data=(JSONObject) array.get(i);
                System.out.println("name "+data.get("name"));
                System.out.println("emp id "+data.get("emp id"));
                System.out.println("contact number "+data.get("contact number"));
                System.out.println();
            }
        }
    }
