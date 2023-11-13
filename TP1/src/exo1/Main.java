package exo1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        CollectNbr a = new  CollectNbr(x);
        CollectNbr b = new  CollectNbr(y);
        a.VerifierNombre(x);
        b.VerifierNombre(y);
    }
}