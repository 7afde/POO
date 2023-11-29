package exo4;
import java.util.Arrays;
import java.util.Scanner;
public class Enseignant extends Personne{
    private String[] modules;
    public Enseignant(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
    public void affecterModules() {
        Scanner scan = new Scanner(System.in);
        modules = new String[4];

        System.out.println("Enter the modules :");

        for (int i = 0; i < 4; i++) {
            System.out.print("Module "+(i+1)+": ");
            modules[i] = scan.nextLine();
        }
        scan.close();
    }
    @Override
    public String toString() {
        return super.toString() + " Modules : " + Arrays.toString(modules);
    }

}
