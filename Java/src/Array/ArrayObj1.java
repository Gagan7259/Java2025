package Array;

public class ArrayObj1 {
    public static void main(String[] args) {
//        String name = "Gaga";
//        String name = "Gagan";
//        System.out.println(name);
//        System.out.println(name.hashCode());
//        name = name + "Reddy";
//        System.out.println("Hello " + name);
//        STRING CONSTRAINT

//
//        String s1 = "Gagan";
//        String s2 = "Gagan";
//        System.out.println(s1 == s2);


//        Mutable sring and immutable string
//        STringbuffer and StringBuilder

        StringBuffer st = new StringBuffer("gagan Kumar");
        System.out.println(st.capacity());
        System.out.println(st.length());
        st.ensureCapacity(100);

        System.out.println(st.capacity());
    }
}
