package model;

import java.util.ArrayList;

public class Athlete {
    private int id ;
    private String nom ;
    private ArrayList<Pays> lesPays ;

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

    public ArrayList<Pays> getLesPays() {
        return lesPays;
    }

    public void setLesPays(ArrayList<Pays> lesPays) {
        this.lesPays = lesPays;
    }
}
