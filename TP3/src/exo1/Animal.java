package exo1;

public abstract class Animal {
    private String nom;
    private boolean vegetarien;


    public Animal(String nom, boolean vegetarien) {
        this.nom = nom;
        this.vegetarien = vegetarien;
    }
    public abstract void Diagnostique(double poids);
    public abstract void Diagnostique(int age);















    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                ", vegetarien=" + vegetarien +
                '}';
    }
}
