package Collections_Framework;

import java.util.HashMap;
import java.util.Map;

public class MAPPP {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("Gagan", 35);
        students.put("Manoj", 34);
        students.put("Sai", 36);
        System.out.println(students.keySet());

        for(String key:students.keySet()){
            System.out.println(key+" "+students.get(key));
        }

    }
}
