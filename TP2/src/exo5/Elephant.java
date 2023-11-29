package exo5;

public class Elephant extends Animal{
    public Elephant(String nom, boolean vegetarien){
        super(nom, vegetarien);
    }

    @Override
    public String toString() {
        return super.toString()+"Elephant .";
    }
}
