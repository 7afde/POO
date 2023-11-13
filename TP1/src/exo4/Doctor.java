package exo4;
import java.util.ArrayList;
public class Doctor {
    private String nom;
    private String prenom;
    private String spesialite;
    private ArrayList<Patient> patient = new ArrayList<>();

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
    public String getSpesialite() {
        return spesialite;
    }
    public void setSpesialite(String spesialite) {
        this.spesialite = spesialite;
    }
    public Doctor(String nom, String prenom, String spesialite) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.spesialite = spesialite;
    }

    public void AjouterPatient(Patient p) {
        p.AffecterDocteur(nom);
        patient = new ArrayList<>();
        patient.add(p);
    }

    public void AfficherMesPatient() {
        for(int i=0; i < patient.size(); i++) {
            System.out.println("patient list of :"+nom+" "+ patient.get(i));
        }
    }

    public String toString() {
        return "nom "+ nom+ " prenom"+prenom+ " spesiality :"+spesialite;

    }
}
