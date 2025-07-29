package Objects;


public class Objcetex {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 6};

        System.out.println(nums[0]);
        for (int num : nums) {
            System.out.println("Array Numbrtrs" + " " + num);
        }

        System.out.println("******************");
        for (int i = 0; i <= 3; i++) {
            System.out.println("For lo" +
                    "op array Valiues" + " " + nums[i]);
        }

    }
}
