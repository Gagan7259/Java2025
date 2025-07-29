package DataStructures;

import java.util.Arrays;

public class BinarySearch {
//    public static int linearSerach(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                return i;
//            } else {
//
//            }
//        }
//        return -1;
//    }

    public static int Binarrysearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {26, 33, 34, 5, 6, 7, 89, 0, 10, 30, 50, 5678, 546};
        Arrays.sort(nums);
        System.out.println(nums);
        Arrays.stream(nums).forEach(n -> System.out.println(n));

        int target = 30;
//        int result = linearSerach(nums, target);
        int result2 = Binarrysearch(nums, target);
        if (result2 != -1) {
            System.out.println("Element found" + result2);

        } else {
            System.out.println("Element not found");
        }


    }
}
