package Objects;

class Student {
    String name;
    int marks;

}

public class StudentObj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks = 90;
        s1.name = "gagan";

        Student s2 = new Student();
        s2.marks = 80;
        s2.name = "Manoj";

        Student s3 = new Student();
        s3.marks = 70;
        s3.name = "Jagan";

        Student[] studentss = new Student[3];
        studentss[0] = s1;
        studentss[1] = s2;
        studentss[2] = s3;

        for (int i = 0; i < studentss.length; i++) {
            System.out.println(studentss[i].marks);
        }

        System.out.println("*****************");

        for (Student n : studentss) {
            System.out.println("Student Values using enchaded " + n.marks);
        }

    }
}
