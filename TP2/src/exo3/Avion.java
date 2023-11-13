package exo3;

public class Avion extends Vehicule{
    int heuresVol;
    public Avion(String marque, int dateAchat, double prixAchat, int heuresVol) {
        super(marque, dateAchat, prixAchat);
        this.heuresVol = heuresVol;
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Heures de vol: " + heuresVol);
    }
    @Override
    public double calculPrix(){
        int anciennete = 2023 - dateAchat;
        double prixReduit = prixAchat;
        for (int i = 0; i < anciennete; i++) {
            prixReduit *= 0.95;
        }
        double reductionHeuresVol = (heuresVol / 5000) * 0.08;
        prixReduit *= (1 - reductionHeuresVol);

        return prixReduit;
    }
}
