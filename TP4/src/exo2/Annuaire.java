package exo2;
import exo1.Personne;

import java.util.*;
public class Annuaire {
    private ArrayList<Contact> ListOfContacts;

    public Annuaire() {
        this.ListOfContacts = new ArrayList<Contact>();
    }
    public void Add_Annuaire(Contact vi){
        ListOfContacts.add(vi);
    }
    public void Search_by_Name(String nom){
        for (Contact i : ListOfContacts){
            if (i.getNom() == nom){
                System.out.println("same name");
                break;
            }
        }
    }
    public void Search_by_Number(long n){
        for (Contact i : ListOfContacts){
            if (i.getNumber() == n){
                System.out.println("same number");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Annuaire{" +
                "ListOfContacts=" + ListOfContacts +
                '}';
    }
}
