package Collections_Framework;

import java.util.ArrayList;
import java.util.Collection;

public class Collectionn {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(23);
        nums.add(54);
        nums.add(98);
        nums.add(56);
        nums.add(67);
        System.out.println(nums);

        for(Object num:nums){
            System.out.println("Using For each  object "+num);
        }
        System.out.println("****************");
        for(int num:nums){
            System.out.println("Using For each Integer "+num);
        }
    }
}
