package eni.tp.app.eni_app.controller;

import eni.tp.app.eni_app.manager.MovieManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping(value={"/", "home"})
    public String getHomeView() {
        return "home";
    }
    @RequestMapping(value={ "detail-film"})
    public String getListFilm() {
        return "film";
    }
    @RequestMapping(value={ "list-film"})
    public String getSerie(Model model){

        model.addAttribute("filmList", MovieManager.getListFilm());

        return "list-film";
    }
    @RequestMapping(value={ "login"})
    public String getLoginView() {

        return "login";
    }
}
