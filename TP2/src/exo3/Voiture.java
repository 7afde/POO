package exo3;

public class Voiture extends Vehicule{
    int NbrPortes;
    int Puissance;
    double Kilometrage;
    public Voiture(String marque, int dateAchat, double prixAchat, int NbrPortes, int Puissance, double Kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.NbrPortes = NbrPortes;
        this.Puissance = Puissance;
        this.Kilometrage = Kilometrage;
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Nombre de portes: " + NbrPortes);
        System.out.println("Puissance: " + Puissance+" HP.");
        System.out.println("Kilométrage: " + Kilometrage +" Km.");
    }
    @Override
    public double calculPrix(){
        super.calculPrix();
        double prixReduit = prixAchat;

        double reductionKilometrage = (Kilometrage / 100000) * 0.10;
        prixReduit *= (1 - reductionKilometrage);
        return prixReduit;
    }

}
