package exo1;
import java.util.Arrays;
public class Livre extends Document {
    private String ISBN;
    private double prix;
    private int annee;
    public Livre(String nom, String ISBN, double prix, int annee) {
        super(nom);
        this.ISBN = ISBN;
        this.prix = prix;
        this.annee = annee;
    }
    @Override
    public String toString() {

        return "Nom du livre: " + getNom() + ", ISBN=" + ISBN + ", Année de publication: " + annee + ". " + super.toString() + '.';
    }
    public double PrixVente(Personne p){
        for (int i = 0; i < getNbrAuteurs(); i++){
            if (getAuteurs().get(i).equals(p)){
                return 0;
            }
        }
        if (p.getAnnee() > (annee - 20)){
            return prix * 0.8;
        }
        return prix;
    }

}


