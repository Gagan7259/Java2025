package Strings;

public class StringBufferr {
    public static void main(String[] args) {
        StringBuffer st = new StringBuffer("Gagan");
        System.out.println(st.capacity());
        System.out.println(st.append(" Hellio"));

        String stt = st.toString();
        System.out.println(stt);
    }
}
