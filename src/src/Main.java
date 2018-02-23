import event.Event;
import  utils.Utils;

public class Main {

    public static void main(String[] args) {
        debug();

    }

    private static void debug(){
        String str = Event.mocEvent().toString();
        Utils.log(str);
    }
}
