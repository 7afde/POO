package exo2;

public class Contact extends Annuaire implements Comparable<Contact>{
    private String nom;
    private String prenom;
    private int number;

    public Contact(String nom, String prenom, int number) {
        this.nom = nom;
        this.prenom = prenom;
        this.number = number;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Contact o) {
        return this.getNom().compareTo(o.getNom());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", number=" + number +
                "} " + super.toString();
    }
}
