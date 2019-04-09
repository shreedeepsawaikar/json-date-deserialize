package in.lolxz;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.lolxz.model.TestModel;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws IOException {

        //To create a simple json object for test.
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("testDate", "Tue Apr 09 21:59:48 CEST 2019");
        jsonObject.put("name", "testname");

        //To map json data with the class
        ObjectMapper objectMapper = new ObjectMapper();
        TestModel testDate = objectMapper.readValue(jsonObject.toString(), TestModel.class);

        System.out.println("from object " + testDate.getTestDate());



    }
}
