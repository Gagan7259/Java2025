package Abstract;

class Laptop {

    public void code() {
        System.out.println("Compile, run");
    }
}

class Developer {
    public void devApp(Laptop lap) {
        lap.code();
    }
}

public class Company {
    public static void main(String[] args) {
        Laptop dev = new Laptop();
        dev.code();
        Developer dev1=new Developer();

    }
}
