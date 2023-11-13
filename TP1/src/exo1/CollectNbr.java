package exo1;

public class CollectNbr {
    private int x;

    public CollectNbr(int x) {
        this.x =x;
    }

    public void VerifierNombre(int n) {
        if (n % 2 == 0) {
            System.out.println("pair");
        }
        else {
            System.out.println("impair");
        }
    }

}
