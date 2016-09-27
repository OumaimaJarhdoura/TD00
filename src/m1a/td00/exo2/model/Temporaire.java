package m1a.td00.exo2.model;


public abstract class Temporaire extends Enseignant {
    private String DateF;

    public Temporaire (String n, String p, String SS, String dateD, float salaire, String dateF)
    {
        super (n,p,dateD,SS,salaire);
        this.DateF= dateF;

    }
}
