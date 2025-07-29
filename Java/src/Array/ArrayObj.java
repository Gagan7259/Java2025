package Array;

public class ArrayObj {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] numbr = new int[8];
        numbr[0] = 45;
        numbr[1] = 98;
        numbr[2] = 76;
        System.out.println(numbr[0]);

        for (int n : numbr) {
            System.out.println(n);
        }
    }
}