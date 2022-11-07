package TP5.Excercice1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Logging {
    private static HashMap<String, Logging> instances = new HashMap<String, Logging>();
    private String log = "";

    public Logging() {
        log = "";
    }

    public static synchronized Logging getInstance(String key) {
        Logging instance = instances.get(key);

        if (instance == null) {
            instance = new Logging();
            instances.put(key, instance);
        }
        return instance;
    }

    public void addLog(String message) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        log+="[" + dateFormat.format(date) + "] " + message + "\n"; ;
    }

    public void displayLog() {
        System.out.println(log);
    }
}
