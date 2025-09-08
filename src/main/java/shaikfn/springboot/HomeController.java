package shaikfn.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";   // will load index.html from templates
    }

    @GetMapping("/about")
    public String about() {
        return "about";   // will load about.html from templates
    }
}
