package in.lolxz.jsondatedeserializable;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.apache.commons.lang3.time.DateUtils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHandler extends StdDeserializer<Date> {

    //Date formats that needs to be handled
    private final String [] DATE_FORMATS = {"EEE MMM dd HH:mm:ss z yyyy", "yyyy-MM-dd"};


    public DateHandler() {
        this(null);
    }

    public DateHandler(Class<?> vc) {
        super(vc);
    }


    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException, JsonProcessingException {
        String date = jsonParser.getText();
        SimpleDateFormat simpleDateFormat = null;
        try {

            return DateUtils.parseDate(date, DATE_FORMATS);

        } catch (ParseException e) {
            return null;
        }
    }
}
