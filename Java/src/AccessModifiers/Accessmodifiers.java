package AccessModifiers;
class A{
    public void display(){
        System.out.println("Hello");
    }
    private  int marks;
    protected   int mark;


}

public class Accessmodifiers {
    public static void main(String[] args) {
        A obj=new A();
        obj.display();
        System.out.println(obj);
    }
}
