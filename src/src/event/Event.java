package event;
import utils.Utils;

import java.util.Calendar;
import java.util.Date;


public class Event {
   private Date date;
   private String type;
   private String title;
   private String description;

    public Event(Date date, String type, String title, String description  ){
        this.date = date;
        this.type = type;
        this.title = title;
        this.description = description;

    }

    @Override
    public String toString() {
        return "Event{" +
                "\ndate=" + date +
                ", \ntype='" + type + '\'' +
                ", \ntitle='" + title + '\'' +
                ", \ndescription='" + description + '\'' +
                '}';
    }

    public static Event mocEvent(){
        return new Event(Calendar.getInstance().getTime(),
                Utils.getString("type"),
                Utils.getString("title"),
                Utils.getString("description"));
    }

}
