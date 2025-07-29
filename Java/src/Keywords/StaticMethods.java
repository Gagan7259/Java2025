package Keywords;

class Mobile1 {
    String brand;
    Integer price;
    String name;


    public void show() {
        System.out.println("Btrand is :" + brand + ' ' + "Mobile price is " + " " + price + "Mobile name is :" + name);
    }
}

public class StaticMethods {
    //Comman variable which used by all objects
//    Static varible shared by all objects
//    Static varib;le is called by CLASS NAME not Objects
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.brand = "Oneplus";
        mb.price = 67000;
        mb.name = "One plus nord ce$";


        Mobile mb1 = new Mobile();
        mb1.brand = "Iphone";
        mb1.price = 70000;
        mb1.name = "16Pro max";


        mb.show();
        mb1.show();
    }
}
