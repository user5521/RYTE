package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utils {

    public static String getString(String arg){
        SimpleDateFormat dateFormat = new SimpleDateFormat(" HH:mm:ss");
        return arg + dateFormat.format(Calendar.getInstance().getTime() );

    }

    public static void log(String args) {
        System.out.println(args);
    }
}
