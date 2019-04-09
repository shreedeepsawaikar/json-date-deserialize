package in.lolxz.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import in.lolxz.jsondatedeserializable.DateHandler;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestModel {
    private String name;

    //To use custom deserializer to parse date.
    @JsonDeserialize(using = DateHandler.class)
    private Date testDate;

    public TestModel() {
    }


    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



