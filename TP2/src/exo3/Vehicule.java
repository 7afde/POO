package exo3;

import java.util.Objects;

public class Vehicule {
    String marque;
    int dateAchat;
    double prixAchat;
    public Vehicule(String marque, int dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }
    public void afficher() {
        System.out.println("Marque: " + marque);
        System.out.println("Date d'achat: " + dateAchat);
        System.out.println("Prix d'achat: " + prixAchat+" DA.");
    }
    public double calculPrix(){
        int anciennete = 2023 - dateAchat;
        double prixReduit = prixAchat;
        for (int i = 0; i < anciennete; i++) {
            prixReduit *= 0.95;
        }
        return prixReduit;
    }

    @Override
    public boolean equals(Object x) {
        if (this == x) return true;
        if (!(x instanceof Vehicule vehicule)) return false;
        return dateAchat == vehicule.dateAchat && Double.compare(prixAchat, vehicule.prixAchat) == 0 && Objects.equals(marque, vehicule.marque);
    }

}
