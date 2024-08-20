package eni.tp.app.eni_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

    @RequestMapping(value={ "login"})
    public String getHomeView() {

        return "login";
    }
}
