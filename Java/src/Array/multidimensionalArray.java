package Array;

public class multidimensionalArray {
    public static void main(String[] args) {
        int[][] arrayy = new int[3][4];

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(arrayy[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arrayy[i][j] = (int) (Math.random() * 100);
                System.out.print(arrayy[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("enhanced for loop");

        for (int[] n : arrayy) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
