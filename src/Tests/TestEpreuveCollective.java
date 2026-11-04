package Tests;

import model.EpreuveCollective;

public class TestEpreuveCollective {
    public static void main (String[] args){

        EpreuveCollective uneAutreEpreuveCollective = new EpreuveCollective(1,"tournoi masculin",40,4);

        System.out.println( "Le nom de l'épreuve est : "+ uneAutreEpreuveCollective.getNom() +" la durée de l'épreuve est de : "+ uneAutreEpreuveCollective.getDureeMin() +" le nombre de tours passés est de  : "+ uneAutreEpreuveCollective.getNbTours());
    }
}
