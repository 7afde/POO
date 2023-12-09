package exo2;

public class Main {
    public static void main(String[] args) {

        Avion v1 = new Avion("Bowing", 2022, 700000000, 2000);
        Voiture v2 = new Voiture("polo", 2020, 2000000, 4, 200, 200000);
        Voiture v3 = new Voiture("polo", 2020, 2000000, 4, 200, 200000);

        Helicoptere v4 = new Helicoptere("Bowing", 2022, 700000000, 2000);

        v1.calculPrix();
        v2.calculPrix();
        v3.calculPrix();
        v4.calculPrix();
        boolean equals = v2.equals(v3);
        System.out.println(equals);
        System.out.println();

        v1.afficher();
        v1.CanFly();
        v1.LongDistanceFlight();
        System.out.println();

        v2.afficher();
        v2.RoadDriving();
        System.out.println();

        v3.afficher();
        v3.RoadDriving();
        System.out.println();

        v4.afficher();
        v4.CanFly();
        v4.LongDistanceFlight();

    }


}
