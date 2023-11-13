package exo4;

public class PatientRecord {
    private String dateAppointement;
    private String Diagnosis;
    private String treatment;

    public PatientRecord(String dateAppointement, String Diagnosis, String treatment) {
        this.dateAppointement = dateAppointement;
        this.Diagnosis = Diagnosis;
        this.treatment = treatment;
    }
    public void afficherrecord(){
        System.out.println("date: "+dateAppointement);
        System.out.println("Diagnosis :"+Diagnosis);
        System.out.println("tretment :"+treatment);
    }
}
