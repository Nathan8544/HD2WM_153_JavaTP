package eni.tp.app.eni_app.Controller;

import eni.tp.app.eni_app.entite.Member;
import eni.tp.app.eni_app.entite.Movie;
import eni.tp.app.eni_app.manager.MovieManager;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MovieController {
    @GetMapping("detail-movie/{id}")
    public String getMovieDetails(@PathVariable("id") long id, Model model) {
        String page;

        if (MovieManager.getMovie(id) == null) {
            model.addAttribute("id", id);
            page = "movie-details-error";
        }else {
            model.addAttribute("movie", MovieManager.getMovie(id));
            page = "movie-details";
        }

        return page;
    }
    @GetMapping(value={ "list-movie"})
    public String getListMovie(Model model){
        model.addAttribute("movieList", MovieManager.getListMovie());
        List<Integer> maxStars = Arrays.asList(1, 2, 3, 4, 5);
        model.addAttribute("maxStar", maxStars);

        return "list-movie";
    }
    //Formulaire
    @GetMapping(value={ "form-movie"})
    public String getFormMovie(Model model){
        Movie movie = new Movie();
        model.addAttribute("movie", movie);

        return "form-movie";
    }
    @PostMapping(value={ "form-movie"})
    public String postFormMovie(@Valid @ModelAttribute Movie movie,  BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "form-movie";
        }
        model.addAttribute("movie", movie);

        return "redirect:/";
    }

}
