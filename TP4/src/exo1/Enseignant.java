package exo1;
import java.util.*;
public class Enseignant extends Personne implements Comparable<Enseignant>{
    private ArrayList<String> modules;
    private static ArrayList<Enseignant> enseignants = new ArrayList<>();
    public Enseignant(String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.modules = new ArrayList<String>();
    }

    public ArrayList<String> getModules() {
        return modules;
    }

    public void setModules(ArrayList<String> modules) {
        this.modules = modules;
    }

    public static ArrayList<Enseignant> getEnseignants() {
        return enseignants;
    }

    public static void setEnseignants(ArrayList<Enseignant> enseignants) {
        Enseignant.enseignants = enseignants;
    }

    public void affecterModules() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the modules :");

        this.modules.add(scan.nextLine());
    }
    @Override
    public void stoker() {

    }

    @Override
    public int compareTo(Enseignant o) {
        return this.getNom().compareTo(o.getNom());
    }
    @Override
    public String toString() {
        return super.toString() + " Modules : " + Arrays.toString(new ArrayList[]{modules});
    }
}
