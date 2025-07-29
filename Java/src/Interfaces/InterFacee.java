package Interfaces;

@FunctionalInterface
interface A {
    void run();

}

public interface InterFacee {
    static void main(String[] args) {


//        A obj=new A() {
//            @Override
//            public void run() {
//                System.out.println("run Methopd");
//            }
//        };
//        obj.run();
        A obj = () -> {
            System.out.println("Hello");
        };
        obj.run();
    }
}

