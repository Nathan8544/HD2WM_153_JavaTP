package eni.tp.app.eni_app.Controller;

import eni.tp.app.eni_app.entite.Member;
import eni.tp.app.eni_app.manager.MovieManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Arrays;
import java.util.List;

@Controller
public class homeController {

    @Autowired
    MovieManager movieManager;

    @RequestMapping(value={"/", "home"})
    public String getHomeView(Model model) {
        model.addAttribute("movieList", movieManager.getListMovie());

        return "home";
    }
}
