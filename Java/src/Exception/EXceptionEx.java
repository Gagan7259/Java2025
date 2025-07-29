package Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EXceptionEx {
    public static void main(String[] args) {
        int i = 4, j = 16;
        int num = 0;
        try {
//            int result = j / i;
//            System.out.println(result);
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader r = new BufferedReader(in);
            num = Integer.parseInt(r.readLine());
            System.out.println(num);

        } catch (Exception e) {
            System.out.println("Not good Way To code");
        }
    }
}
