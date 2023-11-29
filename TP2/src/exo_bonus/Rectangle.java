package exo_bonus;

public class Rectangle extends Forme_Geo{
    double h;
    double l;
    public Rectangle(String nom, String color, double h, double l) {
        super(nom, color);
        this.h = h;
        this.l = l;
    }
    public double Surface(double h, double l){
        return h*l;
    }
    public double Pirimetre(double h, double l){
        return (h*l)*2;
    }
    @Override
    public String toString() {
        return super.toString()+"un Rectangle"+" la surface: "+Surface(h,l)+" .le pirimetre: "+Pirimetre(h, l) ;
    }
}
