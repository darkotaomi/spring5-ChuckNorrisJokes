package darko.springframework.spring5chucknorrisjokes.controllers;

import darko.springframework.spring5chucknorrisjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;
//konstruktor radi automatski Dependency injection
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String printJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
//mojnacin
//    public String printJoke(){
//        return jokeService.getJoke();
//    }
}
