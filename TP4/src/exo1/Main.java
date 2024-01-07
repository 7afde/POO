package exo1;

public class Main {
    public static void main(String[] args) {
        Etudiant etud1 = new Etudiant("Akram", "Mounoub", 19);
        Etudiant etud2 = new Etudiant("Akram", "Mounoub", 19);
        Etudiant etud3 = new Etudiant("Akram", "Mounoub", 19);
        Enseignant ens1 = new Enseignant("Islam", "Ali", 30);
        Enseignant ens2 = new Enseignant("Islam", "Ali", 30);
        Enseignant ens3 = new Enseignant("Islam", "Ali", 30);

        etud1.stoker();
        etud2.stoker();
        etud3.stoker();
        ens1.stoker();
        ens2.stoker();
        ens3.stoker();



    }
}