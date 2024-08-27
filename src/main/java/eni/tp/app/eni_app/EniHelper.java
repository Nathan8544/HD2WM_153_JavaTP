package eni.tp.app.eni_app;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class EniHelper {
    public static void sendCommonFlashMessage(RedirectAttributes redirectAttributes, int type, String message) {
        redirectAttributes.addFlashAttribute("flashMessage",
                new EniFlashMessage(type, message));
    }
}
