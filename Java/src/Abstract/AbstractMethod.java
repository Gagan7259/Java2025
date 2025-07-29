package Abstract;

abstract class Cae {
    public abstract void drivr();
}

class WaganoR extends Cae {
    public void drivr() {
        System.out.println("Drive Bro");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Cae ca = new WaganoR();
        ca.drivr();
    }
}
