package Exception;

public class EXCEPTIONNS {
    public static void main(String[] args) {
        try {
            int i = 9 / 0;
            System.out.println(i);
            throw new MyException("Hello World");
        } catch (MyException e) {
            System.out.println("Hruhb " + e);
        }
        System.out.println("Hello");
    }

    public static class MyException extends Exception {

        public MyException(String str) {
            super(str);
        }
    }
}
