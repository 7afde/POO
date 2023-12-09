package exo2;

public class Voiture extends Vehicule implements Driving{
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
    public double calculPrix() {
        int anciennete = 2023 - dateAchat;
        double prixReduit = prixAchat;
        for (int i = 0; i < anciennete; i++) {
            prixReduit *= 0.95;
        }
        double reductionKilometrage = (Kilometrage / 100000) * 0.10;
        prixReduit *= (1 - reductionKilometrage);
        return prixReduit;
    }

    @Override
    public void afficher() {
        System.out.println("Marque: " + marque);
        System.out.println("Date d'achat: " + dateAchat);
        System.out.println("Prix d'achat: " + prixAchat+" DA.");
        System.out.println("Nombre de portes: " + NbrPortes);
        System.out.println("Puissance: " + Puissance+" HP.");
        System.out.println("Kilométrage: " + Kilometrage +" Km.");
    }

    @Override
    public boolean equals(Object x) {
        Voiture v =(Voiture) x;
        return this.getDateAchat() == v.getDateAchat() &&
                Double.compare(this.getPrixAchat(),v.getPrixAchat()) == 0 &&
                this.getMarque().equals(v.getMarque());
    }

    @Override
    public void RoadDriving() {
        System.out.println("Cette a la possibilite de se deplacer sur des routes");
    }
}
