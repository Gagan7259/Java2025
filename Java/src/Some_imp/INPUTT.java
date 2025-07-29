package Some_imp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class INPUTT {
    public static void main(String[] args) throws IOException {
//        System.out.println("Enter A Number");
//        int num=System.in.read();
//        System.out.println(num-48);


        /*INPUTREADER AND BUFFERREADER*/
      /*  InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);*/


        /*SCANNER OBJECT*/
        Scanner sc=new Scanner(System.in);
       int num= sc.nextInt();
        System.out.println(num);
    }
}
