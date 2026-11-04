package Tests;

import model.EpreuveCollective;
import model.Pays;

import java.util.ArrayList;
import java.util.List;

public class TestEpreuveCollective {
    public static void main (String[] args){

        ArrayList<Pays> lesPays = null;

        Pays unPays = new Pays(1,"France");
        Pays unautrePays = new Pays(2,"Angleterre");
        Pays un3emePays = new Pays(3,"Allemagne");

        //ne fonctionne pas
        lesPays.add(unPays);
        lesPays.add(unautrePays);
        lesPays.add(un3emePays);

        EpreuveCollective uneAutreEpreuveCollective = new EpreuveCollective(1,"tournoi masculin",40,4);

        System.out.println("Le nom de l'épreuve est : "+ uneAutreEpreuveCollective.getNom() +" la durée de l'épreuve est de : "+ uneAutreEpreuveCollective.getDureeMin() +" le nombre de tours passés est de  : "+ uneAutreEpreuveCollective.getNbTours());
    }
}
