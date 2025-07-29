package Collections_Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(23);
        nums.add(54);
        nums.add(98);
        nums.add(67);
        nums.add(56);

        Set<Integer> nums2 = new TreeSet<Integer>();
        nums2.add(23);
        nums2.add(54);
        nums2.add(98);
        nums2.add(67);
        nums2.add(56);

        System.out.println(nums);


        Iterator<Integer> vales = nums2.iterator();
        while (vales.hasNext()) {
            System.out.println(vales.next());
        }
//        for(int i:nums){
//            System.out.println(i);
//        }
//        for(int i:nums2){
//            System.out.println("Treeset set "+i);
//        }
    }
}
