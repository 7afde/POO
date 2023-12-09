package exo2;

public class Helicoptere extends Vehicule implements Flight{
    int heuresVol;
    public Helicoptere(String marque, int dateAchat, double prixAchat, int heuresVol){
        super(marque, dateAchat, prixAchat);
        this.heuresVol = heuresVol;
    }
    @Override
    public double calculPrix() {
        int anciennete = 2023 - dateAchat;
        double prixReduit = prixAchat;
        for (int i = 0; i < anciennete; i++) {
            prixReduit *= 0.95;
        }
        double reductionHeuresVol = (heuresVol / 5000) * 0.08;
        prixReduit *= (1 - reductionHeuresVol);

        return prixReduit;
    }

    @Override
    public void afficher() {
        System.out.println("Marque: " + marque);
        System.out.println("Date d'achat: " + dateAchat);
        System.out.println("Prix d'achat: " + prixAchat+" DA.");
    }

    @Override
    public boolean equals(Object x) {
        Voiture v =(Voiture) x;
        return this.getDateAchat() == v.getDateAchat() &&
                Double.compare(this.getPrixAchat(),v.getPrixAchat()) == 0 &&
                this.getMarque().equals(v.getMarque());
    }

    @Override
    public void CanFly() {
        System.out.println("The Helicoptere can fly");
    }

    @Override
    public boolean LongDistanceFlight() {
        if(heuresVol < 1000){
            return true;
        }else {
            return false;
        }

    }
}
