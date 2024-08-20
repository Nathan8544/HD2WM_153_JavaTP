package eni.tp.app.eni_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping(value={"/", "home"})
    public String getHomeView() {

        return "home";
    }
}
