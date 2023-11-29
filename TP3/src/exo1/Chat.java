package exo1;

public class Chat extends Animal{
    public Chat(String nom, boolean vegetarien) {
        super(nom, vegetarien);
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
}
