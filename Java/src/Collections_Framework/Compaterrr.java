package Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compaterrr {
    public static void main(String[] args) {
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                }
                return -1;
            }
        };

        List<String> students = new ArrayList<>();
        students.add("Gagan");
        students.add("Manoj");
        students.add("Sai");
        students.add("Meena");

//        System.out.println(students);
        Collections.sort(students);
        System.out.println("Sorted String" + students);


    }
}
