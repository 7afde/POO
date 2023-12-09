package exo3;

import java.util.Scanner;

public class Etudiant extends Personne{
    double[] notes = new double[6];

    public Etudiant(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
    public void remplirNotes() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 5 notes:");
        for (int i = 0; i <= 5; i++) {
            double note ;
            System.out.print("Note "+(i+1)+": ");
            note = scan.nextDouble();
            notes[i] = note;
        }
        scan.close();
    }
    public double calculMoyenne() {
        double result;
        double somme = 0;
        for (int i = 0; i < 5; i++) {
            somme += notes[i];
        }
        result = somme / 4;
        return result;
    }
    @Override
    public String toString() {
        return null;
    }
}
