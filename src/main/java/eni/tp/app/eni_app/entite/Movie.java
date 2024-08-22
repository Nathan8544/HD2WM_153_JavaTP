package eni.tp.app.eni_app.entite;

public class Movie {
    private long id;
    private String titre;
    private int annee;
    private int duree; // durée en minutes
    private int note;
    private String synopsis;
    private String poster;

    public Movie(long id, String titre, int annee, int duree, int note, String synopsis, String poster) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.note = note;
        this.synopsis = synopsis;
        this.poster = poster;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public int getAnnee() {
        return annee;
    }

    public int getDuree() {
        return duree;
    }

    public int getNote() {
        return note;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getPoster() {
        return poster;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", annee=" + annee +
                ", duree=" + duree +
                " minutes, note=" + note +
                ", synopsis='" + synopsis + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}
