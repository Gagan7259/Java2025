package Polymorphismm;

class A {
    public void show() {
        System.out.println("A show");

    }
}

class B extends A {
    public void show() {
        System.out.println("A show");

    }
}

class C extends A {
    public void show() {
        System.out.println("c show");

    }
}

public class Polymorphissmm {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        obj=(C)new C();
        obj.show();
    }
}
