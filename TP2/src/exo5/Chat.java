package exo5;

public class Chat extends Animal{
    private String couleur;
    public Chat(String nom, boolean vegetarien, String couleur){
        super(nom, vegetarien);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Chat, and his color is : " + couleur + " .";
    }
}
