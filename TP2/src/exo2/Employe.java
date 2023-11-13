package exo2;

public class Employe {
    String nom;
    String prenom;
    int annee ;
    double NbrHeures;
    double NbrHeuresSupp;

    public Employe(String nom, String prenom, int annee, double NbrHeures, double NbrHeuresSupp) {
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
        this.NbrHeures = NbrHeures;
        this.NbrHeuresSupp = NbrHeuresSupp;
    }

    @Override
    public String toString() {
        return "" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", annee=" + annee +
                ", NbrHeures=" + NbrHeures +
                ", NbrHeuresSupp=" + NbrHeuresSupp +
                '}';
    }
}
