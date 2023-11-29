package exo_bonus;

public class Forme_Geo {
    String nom;
    String color;

    public Forme_Geo(String nom, String color) {
        this.nom = nom;
        this.color = color;
    }

    @Override
    public String toString() {
        return "La forme de nom: "+nom+" et du color: " + color + " est ";
    }
}
