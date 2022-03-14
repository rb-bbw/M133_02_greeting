package ch.bbw.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormGreetingController {

    @GetMapping("/formGreeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "form_greeting";
    }

    @PostMapping("/formGreeting")
    public String greetingResult(Model model, @ModelAttribute Greeting greeting) {
        model.addAttribute("greeting", greeting); // is done automatically
        return "form_result";
    }

}