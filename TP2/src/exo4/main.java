package exo4;
import java.util.NoSuchElementException;
public class main {
    public static void main(String[] args) {
        Personne person = new Personne("Mohamed","Soualmi",50);
        Etudiant etud = new Etudiant("Akram", "Mounoub", 19);
        Enseignant ens = new Enseignant("Islam", "Ali", 30);
        ens.affecterModules();

        ((Etudiant) etud).remplirNotes();
        double moy = ((Etudiant) etud).calculMoyenne();

        System.out.println(ens.toString());
        System.out.println(etud.toString()+"the moyenne is: "+moy);




    }
}
