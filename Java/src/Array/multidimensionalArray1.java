package Array;

public class multidimensionalArray1 {
    public static void main(String[] args) {
        int[][] array = new int[3][];

        array[0] = new int[3];
        array[1] = new int[4];
        array[2] = new int[5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enhanced for loop");
        for (int[] n : array) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
