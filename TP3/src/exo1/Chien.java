package exo1;
import java.util.*;
public class Chien extends Animal implements Pet, MakeSound{
    public Chien(String nom, boolean vegetarien) {
        super(nom, vegetarien);
    }

    @Override
    public void Diagnostique(double poids) {
        if( poids > 20){
            System.out.println("Le chien est obèse.");
        }else{
            System.out.println("Le chien est en bon santee");
        }
    }

    @Override
    public void Diagnostique(int age) {
        if (age > 10) {
            System.out.println("Le chien est vieux.");
        }else{
            System.out.println("Le chien est en bon santee");
        }
    }

    @Override
    public void CanBePet() {
        System.out.println("The dog can be pet");
    }

    @Override
    public int LifeSpan() {
        int ageMoyNature = 10;
        double per = Math.random() * 0.4;
        return (int) (ageMoyNature + (ageMoyNature * per));
    }

    @Override
    public void Cri() {
        System.out.println("howw howw");
    }

    @Override
    public String toString() {
        return "Chien{} " + super.toString();
    }
}
