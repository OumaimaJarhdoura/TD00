package m1a.td00.exo2.model;

public abstract class Personnel {
    private String nom;
    private String prenom;
    private String SS;

    public Personnel (String n, String p, String SS){
        this.nom=n;
        this.prenom=p;
        this.SS=SS;
    }
}
