package Collections_Framework;

import java.util.Arrays;
import java.util.List;

public class StreammApi {
    public static void main(String[] args) {
        List<Integer> st = Arrays.asList(4, 3, 33, 2, 222, 93, 303);
        System.out.println(st);
//        int sum = 0;
//        for (int n : st) {
//            if (n % 2 == 0) {
//
//                sum += n;
//            }
//        }
//        System.out.println(sum);


//        st.forEach((n) -> {
//            System.out.println(n);
//        });


//        Consumer<Integer> com = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        st.forEach(com);


//        Stream<Integer> s1 = st.stream();
//        s1.filter(n -> {
//            boolean result = n % 2 == 0;
//            System.out.println(result);
//            return result;
//        });

        int result=st.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);
    }
}
