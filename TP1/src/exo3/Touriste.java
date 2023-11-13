package exo3;
import java.util.ArrayList;
public class Touriste {
    private String nom;
    private String prenom;
    private int age;
    private String nationality;
    private ArrayList <Pays> paysVisites = new ArrayList();

    public Touriste() {

    }

    public Touriste(String nom, String prenom, int age, String nationality) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.nationality = nationality;
    }

    public void AjouterPays(Pays pays,String continent, String langue, String nom) {

        paysVisites.add(pays);
        pays.setContinant(continent);
        pays.setLanguige(langue) ;
        pays.setNom(nom);
    }

    public void AfficherListePays() {
        if (paysVisites.isEmpty()) {
            System.out.println("No Countries");
        }
        else {
            System.out.println("List of Countries visited by " + prenom + " " + nom + ":");
            int index = 0;
            while (index < paysVisites.size()) {
                System.out.println(paysVisites.get(index).getNom());
                index++;
            }
        }
    }

    public void LaisserCommentaire(Pays pays, String commentaire) {
        pays.setCommentaire(commentaire);
    }

    public void afficherCommentaires(Pays pays) {
        System.out.println(pays.getCommentaire());
    }

    public void samelangue(String x) {

            System.out.println("Pays visited speaks "+x+" is :");
            for(int i = 0; i < paysVisites.size(); i++) {
                if(paysVisites.get(i).getLanguige().equals(x)) {
                    System.out.println(paysVisites.get(i).getNom());
                }
            }


    }
}
