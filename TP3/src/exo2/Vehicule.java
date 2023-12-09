package exo2;

public abstract class Vehicule {
    String marque;
    int dateAchat;
    double prixAchat;

    public String getMarque() {
        return marque;
    }

    public int getDateAchat() {
        return dateAchat;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public Vehicule(String marque, int dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }
    public abstract double calculPrix();
    public abstract void afficher();
    public abstract boolean equals(Object x);

}
