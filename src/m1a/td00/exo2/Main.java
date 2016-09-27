package m1a.td00.exo2;

import m1a.td00.exo2.model.*;

public class Main {

    public static void main(String[] args) {

        String n = "Jo";
        String p = "O";
        String SS = "123456HG7890";
        double bourse= 2340;
        String dateD = "01/01/2015";
        String dateF= "31/12/2017";
        double salaire= 12000;
        String Recherche = "Domaine";



	    Personnel etudiant = new Etudiant (String n, String p, String SS, double bourse);

        Personnel doctorant = new Doctorant(String n, String p, String SS, double bourse);

        Personnel Sec = new Secretaire (String n, String p, String SS, String dateD, String dateF, double salaire);

        Personnel Biblio = new Bibliothequaire(String n, String p, String SS, String dateD, String dateF, double salaire);

        Personnel mc = new MaitreConference(String n, String p, String SS, String dateD, double salaire ,String Recherche);

        Personnel prof = new Professeur(String n, String p, String SS, String dateD, double salaire, String Recherche);

        Personnel a = new ATER(String n, String p, String SS, String dateD, double salaire, String dateF);

        Personnel v = new Vacataire(String n, String p, String SS, String dateD, double salaire, String dateF);

    }
}
