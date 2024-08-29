package eni.tp.app.eni_app.manager;

import eni.tp.app.eni_app.entite.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class MovieManager {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * Le code qui permet de savoir comment convertir/mapper un resultat en SQL en Objet/Classe
     * Comment mapper un resultat SQL en Movie
     */
    static final RowMapper<Movie> MOVIE_ROW_MAPPER = new RowMapper<Movie>() {
        @Override
        public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
            Movie movie = new Movie();

            movie.setId(rs.getLong("id"));
            movie.setTitre(rs.getString("title"));
            movie.setNote(rs.getInt("note"));
            movie.setAnnee(rs.getInt("year"));
            movie.setDuree(rs.getInt("duration"));
            movie.setSynopsis(rs.getString("synopsis"));
            movie.setPoster(rs.getString("poster"));

            return movie;
        }
    };

    public List<Movie> getListMovie() {
        // Execute la requete pour trouver tout les elements d'une table
        return jdbcTemplate.query("SELECT * FROM movie", MOVIE_ROW_MAPPER);
    }

    public Movie getMovieByID(long id) {

        // Execute la requete pour trouver les elements d'une table selon la clause
        List<Movie> movies = jdbcTemplate.query("SELECT * FROM movie WHERE id = ?", MOVIE_ROW_MAPPER, id);
        // Si on trouve aucun element on retourne null
        if (movies.size() == 0) {
            return null;
        }

        // Retourner le premier element
        return movies.get(0);
    }

    public void saveMovie(Movie movie) {
        if (movie.getId() != null && getMovieByID(movie.getId()) != null) {
            jdbcTemplate.update("UPDATE movie SET title = ?, year = ?, duration = ?, synopsis = ?, poster = ? WHERE id = ?",
                    movie.getTitre(),
                    movie.getAnnee(),
                    movie.getDuree(),
                    movie.getSynopsis(),
                    movie.getPoster(),
                    movie.getId());

            return;
        }
        jdbcTemplate.update("INSERT INTO  movie (title, note, year, duration, synopsis, poster) VALUES (?, ?, ?, ?, ?, ?)",
                movie.getTitre(),
                0,
                movie.getAnnee(),
                movie.getDuree(),
                movie.getSynopsis(),
                movie.getPoster());
    }
}
