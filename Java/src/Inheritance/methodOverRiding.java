package Inheritance;

class A {
    public void show() {
        System.out.println("In A Show");
    }

    public void config() {
        System.out.println("In B Config");

    }
}

class B extends A{
    public void show() {
        System.out.println("In B Show");

    }

}

public class methodOverRiding {
    public static void main(String[] args) {
        A ob = new A();
        ob.show();
    }
}
