package exo3;

public class Main {
    public static void main(String[] args) {
        Vehicule v1 = new Avion("Bowing",2022,700000000,2000);
        Vehicule v2 = new Voiture("polo",2020,2000000,4,200,200000);
        Vehicule v3 = new Voiture("polo",2020,2000000,4,200,200000);
        v1.calculPrix();
        v2.calculPrix();

        boolean equals = v2.equals(v3);
        System.out.println(equals);

        v1.afficher();
        System.out.println();
        v2.afficher();
    }
}
