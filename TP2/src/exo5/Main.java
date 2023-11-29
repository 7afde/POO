package exo5;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Elephant("choaib", true);
        Animal a2 = new Chat("zaki", true, "Noir");

        System.out.println(a1);
        System.out.println(a2);

        System.out.println();

        a1.Diagnostique(31);
        a1.Diagnostique(1200.5);

        System.out.println();

        a2.Diagnostique(11);
        a2.Diagnostique(9.5);



    }
}

