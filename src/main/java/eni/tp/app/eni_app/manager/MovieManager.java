package eni.tp.app.eni_app.manager;

import eni.tp.app.eni_app.entite.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MovieManager {

    static List<Movie> listFilm = new ArrayList<>(Arrays.asList(
            new Movie(1, "Les Évadés", 1994, 142, 2, "Deux hommes emprisonnés se lient d'amitié au fil des années, trouvant réconfort et rédemption dans des actes de décence.", "les-evades.jpg"),
            new Movie(2, "Le Parrain", 1972, 175, 3, "Le patriarche vieillissant d'une dynastie criminelle organise le transfert de son empire clandestin à son fils réticent.", "le-parrain.jpg"),
            new Movie(3, "The Dark Knight : Le Chevalier Noir", 2008, 152, 5, "Quand le Joker émerge de son mystérieux passé, il sème le chaos parmi les habitants de Gotham.", "the-drak-knight.webp"),
            new Movie(4, "Pulp Fiction", 1994, 154, 1, "Les vies de deux tueurs à gages, d'un boxeur, d'un gangster et de sa femme s'entrelacent dans quatre histoires de violence et de rédemption.", "puple-fiction.jpg"),
            new Movie(5, "Le Seigneur des anneaux : Le Retour du roi", 2003, 201, 2, "Gandalf et Aragorn mènent les Hommes dans la bataille contre Sauron pour détourner son attention de Frodon et Sam qui approchent du Mont Doom avec l'Anneau Unique.", "seigneur-des-anneaux-retour-du-roi.jpg"),
            new Movie(6, "La Liste de Schindler", 1993, 195, 1, "En Pologne occupée par les nazis, Oskar Schindler se préoccupe progressivement du sort de ses ouvriers juifs après avoir été témoin de leur persécution.", "la-liste-de-schindler.webp"),
            new Movie(7, "Fight Club", 1999, 139, 3, "Un employé de bureau insomniaque et un fabriquant de savon forment un club de combat clandestin qui évolue en quelque chose de bien plus.", "fight-club.jpg"),
            new Movie(8, "Forrest Gump", 1994, 142, 5, "Les présidences de Kennedy et Johnson, la guerre du Vietnam et le scandale du Watergate vus par un homme simple de l'Alabama.", "forrest-gump.jpg"),
            new Movie(9, "Inception", 2010, 148, 5, "Un voleur qui utilise une technologie de partage de rêves pour voler des secrets d'entreprise reçoit pour mission d'implanter une idée dans l'esprit d'un PDG.", "inception.webp"),
            new Movie(10, "Matrix", 1999, 136, 5, "Un pirate informatique découvre la vraie nature de sa réalité et son rôle dans la guerre contre ceux qui la contrôlent.", "matrix.jpg"),
            new Movie(11, "Les Affranchis", 1990, 146, 2, "L'histoire de Henry Hill et de sa vie dans la mafia, de sa relation avec sa femme Karen Hill et de ses partenaires dans la pègre sur plusieurs décennies.", "les-affranchis.jpg"),
            new Movie(12, "Star Wars : Épisode V - L'Empire contre-attaque", 1980, 124, 4, "Après que les rebelles ont été vaincus par l'Empire sur la planète glacée Hoth, Luke Skywalker commence son entraînement Jedi avec Yoda, tandis que ses amis sont poursuivis par Dark Vador.", "star-wars-5.jpg"),
            new Movie(13, "Le Silence des agneaux", 1991, 118, 2, "Une jeune recrue du FBI doit demander l'aide d'un tueur en série manipulateur pour capturer un autre tueur en série qui écorche ses victimes.", "le-silence-des-agneaux.jpg"),
            new Movie(14, "Il faut sauver le soldat Ryan", 1998, 169, 3, "Après le débarquement en Normandie, un groupe de soldats américains va derrière les lignes ennemies pour récupérer un parachutiste dont les frères ont été tués au combat.", "il-faut-sauver-le-soldat-ryan.jpg"),
            new Movie(15, "Interstellar", 2014, 169, 5, "Un groupe d'explorateurs voyage à travers un trou de ver dans l'espace dans une tentative de sauver l'humanité.", "interstellar.jpg"),
            new Movie(16, "Se7en", 1995, 127, 1, "Deux détectives, un débutant et un vétéran, traquent un tueur en série qui utilise les sept péchés capitaux comme mobile.", "seven.jpg"),
            new Movie(17, "La Ligne verte", 1999, 189, 4, "La vie des gardiens dans le couloir de la mort est bouleversée par l'arrivée d'un homme accusé de meurtre, mais possédant un don mystérieux.", "la-ligne-verte.webp"),
            new Movie(18, "Gladiator", 2000, 155, 4, "Un ancien général romain cherche à se venger de l'empereur corrompu qui a tué sa famille et l'a réduit en esclavage.", "gladiator.png"),
            new Movie(19, "Le Roi Lion", 1994, 88, 3, "Le jeune prince Simba et son père sont pris pour cible par son oncle jaloux qui veut s'emparer du trône.", "le-roi-lion.webp"),
            new Movie(20, "Les Infiltrés", 2006, 151, 1, "Un policier infiltré et une taupe dans la police tentent de s'identifier mutuellement tout en infiltrant un gang irlandais à Boston.", "les-infiltres.jpg")
    ));


    public static List<Movie> getListMovie() {
        return listFilm;
    }
    public static Movie getMovie(long id) {
        return listFilm.stream().filter(movie -> movie.getId() == id).findFirst().orElse(null);
    }
}
