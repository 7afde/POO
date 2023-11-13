package exo4;

public class Main {
    public static void main(String[] args) {

        Patient p1 = new Patient("amir", "zouyed", 19);
        Patient p2 = new Patient("mohamed", "zouyed", 19);
        Patient p3 = new Patient("chouaib", "zouyed", 19);

        Doctor d = new Doctor("Mr.hafed","zouyed","dentist");

        d.AjouterPatient(p1);
        d.AjouterPatient(p2); 
        d.AjouterPatient(p3);

        d.AfficherMesPatient();

        System.out.println(d.toString());
        PatientRecord pr = new PatientRecord("12/3/2023","malad","1");
        pr.afficherrecord();
    }

}
