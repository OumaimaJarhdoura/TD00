package m1a.td00.exo2.model;

public class Etudiant implements Personnel {
    private String bourse;

    public Etudiant (String n, String p, String SS, float bourse){
        super(n,p,SS);
        this.bourse=bourse;
    }
}
