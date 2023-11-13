package exo2;

public class Animal {
    private String nom;
    private String race;
    private String type;
    static int nbr_car=0;
    static int nbr_herb=0;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal(String nom, String race, String type) {
        this.nom = nom;
        this.race = race;
        this.type = type;
    }

    public static void AnimalStatistique(Animal tab[]) {
        for (int i=0; i<tab.length; i++) {
            if(tab[i].type == "carnivores") {
                nbr_car = nbr_car+1;

            }
            else if (tab[i].type == "herbivors"){
                nbr_herb = nbr_herb+1;

            }
        }
    }

    public static void OrderAnimal(Animal tab[]) {
        System.out.print("la liste des carnivors :");
        for (int i=0; i < tab.length; i++ ) {
            if(tab[i].type == "carnivores") {

                System.out.print(tab[i].nom+",");
            }


        }
        System.out.println("");
        System.out.print("la liste des herbivors :");

        for (int i=0; i < tab.length; i++ ) {
            if((tab[i].type == "herbivors")){
                System.out.print(tab[i].nom+",");
            }
        }



    }

    void ToString() {
        System.out.println(Animal.nbr_car);
        System.out.println(Animal.nbr_herb);
    }
}
