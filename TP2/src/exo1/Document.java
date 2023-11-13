package exo1;

import java.util.ArrayList;

public class Document {
    private String nom;
    private ArrayList <Personne> auteurs = new ArrayList<>();
    private int nbrAuteurs;

    public Document() {
    }

    public int getNbrAuteurs() {
        return nbrAuteurs;
    }

    public ArrayList<Personne> getAuteurs() {
        return auteurs;
    }

    public String getNom() {
        return nom;
    }

    public Document(String nom) {
        this.nom = nom;
        this.auteurs = new ArrayList<>();
        this.nbrAuteurs = 0;
    }
    public void ajouterAuteur(Personne auteur) {
        if (auteurs.size() < 5) {
            auteurs.add(auteur);
            nbrAuteurs++;
        } else {
            System.out.println("Le nombre maximum d'auteurs est 5.");
        }
    }
    public int NbrAuteur() {
        return nbrAuteurs;
    }

    @Override
    public String toString() {
        return "Document{" +
                "nom='" + nom + '\'' +
                ", auteurs=" + auteurs +
                ", nbrAuteurs=" + nbrAuteurs +
                '}';
    }
}
