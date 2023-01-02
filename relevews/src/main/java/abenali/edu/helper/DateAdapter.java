package abenali.edu.helper;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, Date> {

    private static final String DATE_FORMAT_STRING = "yyyy-MM-dd";

    @Override
    public String marshal(Date v) {
        return new SimpleDateFormat(DATE_FORMAT_STRING).format(v);
    }

    @Override
    public Date unmarshal(String v) throws ParseException {
        return new SimpleDateFormat(DATE_FORMAT_STRING).parse(v);
    }

}