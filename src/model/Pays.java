package model;

import java.util.ArrayList;

public class Pays {
    private int id ;
    private String nom ;
    private ArrayList<Medaille> lesMedailles;

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
}
