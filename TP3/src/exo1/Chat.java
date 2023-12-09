package exo1;
import java.util.*;
public class Chat extends Animal implements Pet, MakeSound{
    private String couleur;
    public Chat(String nom, boolean vegetarien, String couleur){
        super(nom, vegetarien);
        this.couleur = couleur;
    }

    @Override
    public void Diagnostique(double poids) {
        if( poids > 8){
            System.out.println("Le chat est obèse.");
        }else{
            System.out.println("Le chat est en bon santee");
        }
    }

    @Override
    public void Diagnostique(int age) {
        if ( age > 10) {
            System.out.println("Le chat est vieux.");
        }
    }

    @Override
    public void CanBePet() {
        System.out.println("The cat can be pet");
    }

    @Override
    public int LifeSpan() {
        int ageMoyNature = 10;
        double per = Math.random() * 0.4;
        return (int) (ageMoyNature + (ageMoyNature * per));

    }

    @Override
    public void Cri() {
        System.out.println("miawww");
    }

    @Override
    public String toString() {
        return "Chat{" +
                "couleur='" + couleur + '\'' +
                "} " + super.toString();
    }
}
