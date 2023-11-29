package exo2;

public class Devloppeur extends Employe{
    public Devloppeur(String nom, String prenom, int annee, double NbrHeures, double NbrHeuresSupp) {
        super(nom, prenom, annee, NbrHeures, NbrHeuresSupp);
        NbrHeures = 40.0;
    }

    public double CalculPaie(){
        return 40*500;
    }
    public double CalculHeuresSupp(){
        return NbrHeuresSupp*700;
    }
    public double CalculPaieFinal(){
        return (CalculPaie()+CalculHeuresSupp()+(2023-annee)*2000);
    }
    public double CalculImpots(){
        double result = 0.0;
        if(CalculPaieFinal() <= 20000){
            result = 0.0;
        } else if (CalculPaieFinal() > 20000 && CalculPaieFinal() <= 50000) {
            result = (CalculPaieFinal() - 20000)*0.1;
        } else if (CalculPaieFinal() > 50000) {
            result = 3000+((CalculPaieFinal()-50000)*0.2);
        }
        return result;
    }
    @Override
    public String toString() {
        return "Devloppeur" +super.toString() +'\''+
                " la paie finale :"+CalculPaieFinal()+" DA."+'\''+
                " les impots :"+CalculImpots();
    }
}
