package model;

import java.util.ArrayList;

public class Participation {
    private int place ;
    private String temps;
    private ArrayList<Athlete> lesAthletes ;
    private ArrayList<Epreuve> lesEpreuves ;
    private ArrayList<Medaille> lesMedailles ;

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    public ArrayList<Athlete> getLesAthletes() {
        return lesAthletes;
    }

    public void setLesAthletes(ArrayList<Athlete> lesAthletes) {
        this.lesAthletes = lesAthletes;
    }

    public ArrayList<Epreuve> getLesEpreuves() {
        return lesEpreuves;
    }

    public void setLesEpreuves(ArrayList<Epreuve> lesEpreuves) {
        this.lesEpreuves = lesEpreuves;
    }

    public ArrayList<Medaille> getLesMedailles() {
        return lesMedailles;
    }

    public void setLesMedailles(ArrayList<Medaille> lesMedailles) {
        this.lesMedailles = lesMedailles;
    }
}
