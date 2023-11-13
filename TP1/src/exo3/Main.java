package exo3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Touriste touriste1 = new Touriste("Hafed", "Zouyed", 19, "Algeria");

        Pays pay1 = new Pays();
        Pays pay2 = new Pays();
        Pays pay3 = new Pays();
        Pays pay4 = new Pays();



        touriste1.AjouterPays(pay1,"France","Europe","French");
        touriste1.AjouterPays(pay2,"Italy","Europe","Italian");
        touriste1.AjouterPays(pay3,"Algeria","Africa","Arabic");
        touriste1.AjouterPays(pay4, "Morocco", "Africa", "Arabic");






        touriste1.LaisserCommentaire(pay1,"France was Fun!");
        touriste1.LaisserCommentaire(pay2,"I love Italian Pizza ");
        touriste1.LaisserCommentaire(pay3,"algeriaaaa ");
        touriste1.LaisserCommentaire(pay4,"morocccooc ");
        touriste1.AfficherListePays();

        touriste1.afficherCommentaires(pay1);
        touriste1.afficherCommentaires(pay2);
        touriste1.afficherCommentaires(pay3);
        touriste1.afficherCommentaires(pay4);

        System.out.println("entrer la langue :");
        String lang = scan.nextLine();
        touriste1.samelangue(lang);

    }
}
