package Lesson_3.dz3.SerdakovAU;

import java.util.HashMap;
import java.util.Map;

public class TelSpr {
    public static HashMap<String, String> ts = new HashMap<>();

    public static void addTS(String name, String phone) {
        ts.put(phone, name);
    }


    public static void get(String name) {
        for (Map.Entry entry : ts.entrySet()) {
            String string = (String) entry.getKey();
            if (string.contains(name)) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
