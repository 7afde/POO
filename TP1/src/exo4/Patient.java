package exo4;

public class Patient {
    private String nom;
    private String prenom;
    private int age;
    private int id;
    private String votreDocteur;

    public Patient(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        votreDocteur = null;
    }

    public void AffecterDocteur(String nom) {
        votreDocteur =nom ;
    }

    public void AfficherDocteur() {
        if(votreDocteur != null) {
            System.out.println(votreDocteur);
        }else {
            System.out.println("no doctor");
        }
    }

    public String toString() {
        return "\nom: "+nom+" prenom: "+prenom+" votre doctor: "+votreDocteur+" id: "+id;
    }
}
