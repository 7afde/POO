package exo1;

public class main {
    public static void main(String[] args) {
        Personne auteur1 = new Personne("Hafed", "Zouyed", 2004);
        Personne auteur2 = new Personne("Chouaib", "Zouyed", 2004);
        Personne acheteur = new Personne("Zaki", "hehhe", 2005);

        Livre livre1 = new Livre("Livre1", "123456789", 30.0, 2020);
        livre1.ajouterAuteur(auteur1);
        livre1.ajouterAuteur(auteur2);

        System.out.println("the number of auteurs is: " + livre1.getNbrAuteurs());

        System.out.println(livre1);
        double prixVente = livre1.PrixVente(acheteur);
        System.out.println("Prix : " + prixVente);


    }
}
