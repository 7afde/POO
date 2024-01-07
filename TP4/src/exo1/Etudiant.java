package exo1;
import java.util.*;
public class Etudiant extends Personne implements Comparable<Etudiant>{
    private ArrayList<Double> notes;
    private static ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
    public Etudiant(String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.notes = new ArrayList<Double>();
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    public static ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public static void setEtudiants(ArrayList<Etudiant> etudiants) {
        Etudiant.etudiants = etudiants;
    }

    public void remplirNotes() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 5 notes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Note "+(i+1)+": ");
            notes.add(scan.nextDouble());
        }
        scan.close();
    }
    public double calculMoyenne() {
        double result ;
        double somme = 0;
        for (int i = 0; i < notes.size(); i++) {
            somme += notes.get(i);
        }
        result = somme / notes.size();
        return result;
    }
    @Override
    public void stoker() {

    }

    @Override
    public int compareTo(Etudiant o) {
        if (this.getAge() > o.getAge()){
            return 1;
        } else if (this.getAge() < o.getAge()) {
            return -1;
        }else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return super.toString() + " Notes : " + Arrays.toString(new ArrayList[]{notes});
    }
}
