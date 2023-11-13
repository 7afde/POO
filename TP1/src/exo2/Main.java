package exo2;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("lisa","cat","carnivores");
        Animal a2 = new Animal("jack","dog","herbivors");
        Animal a3 = new Animal("rick","rabbit","carnivores");

        Animal tab[] = new Animal[3];
        tab [0] = a1;
        tab [1] = a2;
        tab [2] = a3;

        Animal.AnimalStatistique(tab);
        a1.ToString();
        Animal.OrderAnimal(tab);
    }
}
