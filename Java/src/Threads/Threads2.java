package Threads;

class AB implements Runnable {
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

class BC implements Runnable {
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

public class Threads2 {
    public static void main(String[] args) {
        Runnable ob = new AB();
        Runnable o = new BC();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();
    }
}
