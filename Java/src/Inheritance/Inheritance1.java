package Inheritance;

class Parent {
    public int Add(int a, int b) {
        return a + b;
    }
}

class Child extends Parent {
    public int Sub(int a, int b) {
        return a - b;
    }


}

public class Inheritance1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        int result = p.Add(1, 3);
        System.out.println(result);
    }
}
