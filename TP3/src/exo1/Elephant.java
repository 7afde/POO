package exo1;

public class Elephant extends Animal{
    public Elephant(String nom, boolean vegetarien) {
        super(nom, vegetarien);
    }

    @Override
    public void Diagnostique(double poids) {
        if (poids > 1000) {
            System.out.println("L'elephant est obèse.");
        }else{
            System.out.println("L'elephant est en bon santee");
        }
    }

    @Override
    public void Diagnostique(int age) {
        if (this instanceof Elephant && age > 30) {
            System.out.println("L'elephant est vieux.");
        }else{
            System.out.println("L'elephant est en bon santee");
        }
    }
}
