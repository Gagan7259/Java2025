package Recordd;

//class alien {
//    private final int id;
//    private final String name;
//
//    alien(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    @Override
//    public String toString() {
//        return "alien{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
record alien(int id, String name) {
}

public class AlienClass {
    public static void main(String[] args) {
        alien al = new alien(1, "gagan");
        alien a = new alien(1, "gagan");

        System.out.println(al.equals(a));
    }
}
