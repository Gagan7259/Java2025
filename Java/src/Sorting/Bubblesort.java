package Sorting;

public class Bubblesort {
    public static void main(String[] args) {

        int temp = 0;
        int[] nums = {2, 7, 8, 9, 4, 3};
        for (int n : nums) {
            System.out.print(" " + n);
        }
        System.out.println("After Sorting");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] > nums[j+1] ) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int n : nums) {
            System.out.print(" " + n);
        }
    }
}
