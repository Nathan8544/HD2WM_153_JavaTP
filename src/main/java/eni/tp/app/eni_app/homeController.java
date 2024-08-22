package eni.tp.app.eni_app;

import eni.tp.app.eni_app.manager.MovieManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class homeController {

    @RequestMapping(value={"/", "home"})
    public String getHomeView(Model model) {
        model.addAttribute("movieList", MovieManager.getListMovie());

        return "home";
    }
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
    @GetMapping(value={ "login"})
    public String getLoginView() {

        return "login";
    }
}
