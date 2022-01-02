package guru.springframework.spring5jokesapp.controllers;

import guru.springframework.spring5jokesapp.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {

    JokeServiceImpl jokeServiceImpl;

    public QuoteController(JokeServiceImpl jokeServiceImpl) {
        this.jokeServiceImpl = jokeServiceImpl;
    }

    @RequestMapping("/")
    private String getQuote(Model model) {

        model.addAttribute("joke", jokeServiceImpl.getQuote());

        return "index";
    }
}
