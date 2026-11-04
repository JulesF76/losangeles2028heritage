package model;

public class EpreuveCollective extends Epreuve{
    private int dureeMin ;
    private int nbTours ;

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

    public EpreuveCollective(int id, String nom, int lesSports, int dureeMin, int nbTours) {
        super();
        this.dureeMin = dureeMin;
        this.nbTours = nbTours;
    }
}
