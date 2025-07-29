package Strings;

class A {
    public A() {
        System.out.println("A constructer");
    }
    public  A(int n){
        System.out.println("Int B INteger");
    }
}

class B extends A {
    public B() {
        System.out.println("B constructer");
    }
    public  B(int n){
        super(n);
        System.out.println("Int B INteger");
    }
}

public class SuperrrConstructer {
    public static void main(String[] args) {
        B ob = new B(6);
        System.out.println(ob);
    }
}
