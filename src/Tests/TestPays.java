package Tests;

import model.EpreuveCollective;
import model.Pays;

public class TestPays {
    public static void main (String[] args) {

        Pays unPays = new Pays(1, "France");

        System.out.println("Le numéro du pays est  : " + unPays.getId() + " et son nom est : " + unPays.getNom());
    }
}
