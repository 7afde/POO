package exo_bonus;

public class main {
    public static void main(String[] args) {
        Cercle c1 = new Cercle("hafed","red",3.0);
        Triangle t1 = new Triangle("hafed", "blue", 12.0,3.0,6.0,8.0,4.0);
        Rectangle r1 = new Rectangle("hafed", "white", 12.0,9.0);


        System.out.println(c1.toString());
        System.out.println(t1.toString());
        System.out.println(r1.toString());
    }
}
