package eni.tp.app.eni_app.entite;

public class Movie {
    public final long id;
    public final String titre;
    public final int annee;
    public final int duree; // durée en minutes
    public final String synopsis;

    public Movie(long id, String titre, int annee, int duree, String synopsis) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", annee=" + annee +
                ", duree=" + duree +
                " minutes, synopsis='" + synopsis + '\'' +
                '}';
    }
}

