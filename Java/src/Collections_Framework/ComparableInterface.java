package Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Studentt implements Comparable<Studentt> {

    int age;
    String name;

    public Studentt(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Studentt o) {
        if (this.age > o.age) {
            return 1;
        }
        return -1;
    }
}


public class ComparableInterface {

    public static void main(String[] args) {
        List<Studentt> students = new ArrayList<>();
        students.add(new Studentt(24, "Gagan"));
        students.add(new Studentt(56, "Jai"));
        students.add(new Studentt(12, "Sai"));
        students.add(new Studentt(30, "Manoj"));


        Collections.sort(students);
        System.out.println(students);
        for (Studentt st : students) {
            System.out.println(st);
        }
    }
}
