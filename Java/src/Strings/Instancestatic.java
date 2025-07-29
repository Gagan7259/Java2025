package Strings;

class Mobile {
    static String name;
    String brand;
    int price;

    public void show() {
        System.out.println("Your Mobile brand is :" + brand + "and price is: " + price);
        System.out.println(name);
    }
}

public class Instancestatic {
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.price = 80000;
        mb.brand = "oneplus";
        Mobile.name = "Phone";

//        Mobile mb1 = new Mobile();
//        mb1.price = 80000;
//        mb1.brand = "oneplus";
//
//        System.out.println("Mb1 Values"+mb1.brand);
//        System.out.println("Mb Values"+mb.brand);




    }
}
