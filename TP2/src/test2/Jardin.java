package test2;

public class Jardin {
    public static void main(String[] args) {
        Fleur f1 = new Fleur();
        Rose f2 = new Rose();
        GM.arroser(f1);
        GM.arroser(f2);
        Fleur x = new Rose();
        GM.arroser(x);
    }
}
