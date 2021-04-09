package sk.chatty.test.chatty;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChattyControler {

    @GetMapping("/chat")
    public String getWelcome(Model model) {
        model.addAttribute("test","Application chatty");
        return "chat";
    }
    @GetMapping("/")
    public String greetingForm(Model model) {
        model.addAttribute("user", new User());
        return "chat";
    }

    @PostMapping("/")
    public String greetingSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "chat";
    }
}
