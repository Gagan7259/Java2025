package Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingClass {
    public static void main(String[] args) {
        Comparator<Integer> numss = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                }
                return -1;
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(781);
        nums.add(92);
        nums.add(80);
        nums.add(780);
        nums.add(54);
        System.out.println(nums);
        Collections.sort(nums,numss);
        System.out.println("sorted Nums " + nums);
        System.out.println("sorted Nums COMPATER " + numss);

    }
}
