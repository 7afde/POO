package exo3;
import java.util.ArrayList;
public class Pays {
    private String nom;
    private String commentaire;
    private String languige;
    private String continant;

    public Pays() {

    }

    public Pays(String nom, String languige, String commentaire, String continant) {
        this.nom = nom;
        this.languige = languige;
        this.commentaire = commentaire;
        this.continant = continant;
    }



    public String getNom() {
        return nom;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }



    public String getCommentaire() {
        return commentaire;
    }



    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }



    public String getLanguige() {
        return languige;
    }



    public void setLanguige(String languige) {
        this.languige = languige;
    }



    public String getContinant() {
        return continant;
    }



    public void setContinant(String continant) {
        this.continant = continant;
    }

}
