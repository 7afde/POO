package exo1;

public class Main {
    public static void main(String[] args) {
        Elephant a1 = new Elephant("choaib", true);
        Chat a2 = new Chat("zaki", true, "Noir");
        Chien a3 = new Chien("zaki",false) ;
        a1.toString();
        a1.Diagnostique(31);
        a1.Diagnostique(1200.5);
        a1.Cri();
        System.out.println();

        a2.toString();
        a2.Diagnostique(11);
        a2.Diagnostique(9.5);
        a2.CanBePet();
        System.out.println(a2.LifeSpan());

        System.out.println();

        a3.toString();
        a3.Diagnostique(11);
        a3.Diagnostique(734.4);
        a3.CanBePet();
        System.out.println(a3.LifeSpan());

    }
}