package m1a.td00.exo2.model;

public class Biatoss implements Personnel{
    private String dateD;
    private String dateF;
    private float salaire;

    public Biatos(String n, String p, String SS, String dateD, String dateF, float salaire){
        super(n,p,SS);
        this.dateD=dateD;
        this.dateF=dateF;
        this.salaire=salaire;
    }
}
