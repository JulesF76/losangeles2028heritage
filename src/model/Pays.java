package model;

import java.util.ArrayList;

public class Pays {
    private int id ;
    private String nom ;
    private ArrayList<Medaille> lesMedailles;
    private ArrayList<EpreuveCollective> lesEpreuveCollectives;
    private ArrayList<Athlete> lesAthletes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Medaille> getLesMedailles() {
        return lesMedailles;
    }

    public void setLesMedailles(ArrayList<Medaille> lesMedailles) {
        this.lesMedailles = lesMedailles;
    }

    public ArrayList<EpreuveCollective> getLesEpreuveCollectives() {
        return lesEpreuveCollectives;
    }

    public void setLesEpreuveCollectives(ArrayList<EpreuveCollective> lesEpreuveCollectives) {
        this.lesEpreuveCollectives = lesEpreuveCollectives;
    }

    public Pays(int id, String nom, ArrayList<Medaille> lesMedailles, ArrayList<EpreuveCollective> lesEpreuveCollectives) {
        this.id = id;
        this.nom = nom;
        this.lesMedailles = lesMedailles;
        this.lesEpreuveCollectives = lesEpreuveCollectives;
    }

    public Pays(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public ArrayList<Athlete> getLesAthletes() {
        return lesAthletes;
    }

    public void setLesAthletes(ArrayList<Athlete> lesAthletes) {
        this.lesAthletes = lesAthletes;
    }
}
