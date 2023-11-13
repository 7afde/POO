package exo1;

public class Personne {
    private String nom;
    private String prenom;
    private int annee;

    public Personne(String nom, String prenom, int annee) {
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getAnnee() {

        return annee;
    }
    @Override
    public String toString() {
        return prenom + " " + nom;
    }
}
