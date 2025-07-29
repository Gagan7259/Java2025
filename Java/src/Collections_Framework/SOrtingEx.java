package Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}

public class SOrtingEx {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(17, "Gagan"));
        students.add(new Student(33, "Manoj"));
        students.add(new Student(23, "Sai"));
        students.add(new Student(27, "Meena"));

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if (i.age > j.age) {
                    return 1;
                }
                return -1;
            }
        };

        Collections.sort(students,com);
        System.out.println(students);
    }
}
