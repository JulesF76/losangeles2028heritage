package model;

import java.util.ArrayList;

public abstract class Epreuve {
    private int id ;
    private String nom ;
    private ArrayList<Sport> lesSports;

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

    public ArrayList<Sport> getLesSports() {
        return lesSports;
    }

    public void setLesSports(ArrayList<Sport> lesSports) {
        this.lesSports = lesSports;
    }

    public Epreuve() {
        super();
    }

    public Epreuve(int id, String nom, ArrayList<Sport> lesSports) {
        super();
        this.id = id;
        this.nom = nom;
        this.lesSports = lesSports;
    }
}
