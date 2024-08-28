package eni.tp.app.eni_app.Controller;

import eni.tp.app.eni_app.FlashMessage;
import eni.tp.app.eni_app.IHMHelpers;
import eni.tp.app.eni_app.entite.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SessionAttributes({"loggedUser"})
@Controller
public class AuthController {
    @GetMapping("login")
    public String showLogin(Model model, RedirectAttributes redirectAttributes) {
        Member loggedUser = (Member) model.getAttribute("loggedUser");
        if (loggedUser != null){
            IHMHelpers.sendCommonFlashMessage(redirectAttributes, FlashMessage.TYPE_FLASH_ERROR,"Erreur vous êtes déjà connecte(é)");
            return "auth/already-logged-page";
        }

        Member user = new Member();
        model.addAttribute("user", user);

        return "auth/login-page";
    }

    @PostMapping("login")
    public String processLogin(@ModelAttribute Member user, Model model, RedirectAttributes redirectAttributes) {
        model.addAttribute("loggedUser", user);
        IHMHelpers.sendSuccessFlashMessage(redirectAttributes,"Vous êtes connecté(e) avec succès");

        return "redirect:/";
    }

    @GetMapping("logout")
    public String logout(SessionStatus sessionStatus, RedirectAttributes redirectAttributes) {
        sessionStatus.setComplete();
        IHMHelpers.sendSuccessFlashMessage(redirectAttributes,"Vous êtes déconnecté(e)");

        return "redirect:/";
    }
}
