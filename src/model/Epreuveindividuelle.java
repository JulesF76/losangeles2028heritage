package model;

public class Epreuveindividuelle {
    private double recordOlympique;
    private String unite;

    public double getRecordOlympique() {
        return recordOlympique;
    }

    public void setRecordOlympique(double recordOlympique) {
        this.recordOlympique = recordOlympique;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public Epreuveindividuelle(int id, String nom, int lesSports, double recordOlympique, String unite) {
        super();
        this.recordOlympique = recordOlympique;
        this.unite = unite;
    }
}