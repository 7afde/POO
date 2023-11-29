package exo5;

public class Animal {
    private String nom;
    private boolean vegetarien;
    public Animal(String nom, boolean vegetarien){
        this.nom = nom;
        this.vegetarien = vegetarien;
    }

    @Override
    public String toString() {
        return "The Animal that have the name :" + nom  + ", and vegetarien: " + vegetarien + " ,is an: ";
    }
    public void Diagnostique(double poids) {
        if (this instanceof Chat && poids > 8) {
            System.out.println("Le chat est obèse.");
        }else if (this instanceof Elephant && poids > 1000) {
            System.out.println("L'éléphant est obèse.");
        }else{
            System.out.println("L'animal est en bon santee");
        }
    }
    public void Diagnostique(int age) {
        if (this instanceof Chat && age > 10) {
            System.out.println("Le chat est vieux.");
        }else if (this instanceof Elephant && age > 30) {
            System.out.println("L'éléphant est vieux.");
        }else{
            System.out.println("L'animal est en bon santee");
        }
    }
}
