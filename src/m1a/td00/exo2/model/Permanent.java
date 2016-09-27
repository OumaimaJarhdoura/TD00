package m1a.td00.exo2.model;

public abstract class Permanent extends Enseignant{
    private String Recherche;

    public void Permanent (String n, String p, String SS, String dateD, double salaire, String Recherche)
    {
        super (n,p,SS,dateD,salaire);
        this.Recherche=Recherche;
    }

}
