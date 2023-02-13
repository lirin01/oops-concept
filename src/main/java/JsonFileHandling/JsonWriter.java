package JsonFileHandling;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
public class JsonWriter {
    public static void main(String[] args) throws IOException {
        JSONArray array=new JSONArray();
        JSONObject inner1=new JSONObject();
        JSONObject inner2=new JSONObject();

        inner1.put("name","Raja");
        inner1.put("emp id",1);
        inner1.put("contact number", 2635783758l);

        array.add(inner1);

        inner2.put("name","kamal");
        inner2.put("emp id",2);
        inner2.put("contact number", 3657848357l);

        array.add(inner2);

        FileWriter file=new FileWriter("src/main/java/JsonFileHandling/write.json");
        file.write(array.toJSONString());
        file.close();
    }
}
