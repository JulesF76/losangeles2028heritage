package model;

import java.util.ArrayList;

public class EpreuveCollective extends Epreuve{
    private int dureeMin ;
    private int nbTours ;
    private ArrayList<Pays> lesPays;

    public int getDureeMin() {
        return dureeMin;
    }

    public void setDureeMin(int dureeMin) {
        this.dureeMin = dureeMin;
    }

    public int getNbTours() {
        return nbTours;
    }

    public void setNbTours(int nbTours) {
        this.nbTours = nbTours;
    }

    public EpreuveCollective(int id, String nom, ArrayList<Sport> lesSports, int dureeMin, int nbTours) {
        super(id, nom, lesSports);
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
    }

    public EpreuveCollective(int id, String nom, int dureeMin, int nbTours) {
        super(id, nom);
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
    }

    public ArrayList<Pays> getLesPays() {
        return lesPays;
    }

    public void setLesPays(ArrayList<Pays> lesPays) {
        this.lesPays = lesPays;
    }

    public EpreuveCollective(int id, String nom, ArrayList<Sport> lesSports, int dureeMin, int nbTours, ArrayList<Pays> lesPays) {
        super(id, nom, lesSports);
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
        this.lesPays = lesPays;
    }

    public int getNbPays(){
        return lesPays.size();
    }
}
