package exo2;

public class Commerciaux extends Employe{
    public Commerciaux(String nom, String prenom, int annee, double NbrHeures, double NbrHeuresSupp) {
        super(nom, prenom, annee, NbrHeures, NbrHeuresSupp);
        NbrHeures =40.0;
    }

    public double CalculPaie(){
        return 40*350;
    }
    public double CalculHeuresSupp(){
        return NbrHeuresSupp*500;
    }
    public double CalculPaieFinal(){
        return (CalculPaie()+CalculHeuresSupp()+(2023-annee)*2000);
    }

    @Override
    public String toString() {
        return "Commerciaux" +super.toString() +" la paie finale :"+CalculPaieFinal() ;
    }
}
