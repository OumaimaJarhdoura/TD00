package m1a.td00.exo2.model;

public class Enseignant implements Personnel {
    private String dateRec;
    private float salaire;

    public Enseignant (String n, String p, String SS, String dateD, float salaire){
        super(n,p,SS);
        this.dateRec=dateD;
        this.salaire=salaire;
    }

}
