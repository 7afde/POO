package exo_bonus;

public class Triangle extends Forme_Geo{
    double b;
    double h;
    double c1, c2, c3;
    public Triangle(String nom, String color, double b, double h, double c1, double c2, double c3) {
        super(nom, color);
        this.b = b;
        this.h = h;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    public double Surface(double h, double b){
        return (b*h)/2;
    }
    public double Pirimetre(double c1, double c2, double c3){
        return c1+c2+c3;
    }


    @Override
    public String toString() {
        return super.toString()+"un Triangle"+" la surface: "+Surface(h,b)+" .le pirimetre: "+Pirimetre(c1, c2, c3) ;
    }
}
