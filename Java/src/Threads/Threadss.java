package Threads;

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class Threadss {
    public static void main(String[] args) {
        A ob = new A();
        B o = new B();
        ob.start();
        o.start();
    }
}
