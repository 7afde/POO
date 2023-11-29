package exo_bonus;
import java.math.*;
public class Cercle extends Forme_Geo {
    double r;

    public Cercle(String nom, String color, double r) {
        super(nom, color);
        this.r = r;
    }

    public double Surface(double r){
        return Math.PI*r*r;
    }
    public double Pirimetre(double r){
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return super.toString()+"une Cercle " +" la surface: "+Surface(r)+" .le pirimetre: "+Pirimetre(r);

    }
}
