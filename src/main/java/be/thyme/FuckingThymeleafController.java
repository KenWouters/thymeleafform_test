package be.thyme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/" )
public class FuckingThymeleafController {

    @GetMapping("thyme")
    public ModelAndView showThyme() {
        return new ModelAndView("thymepage").addObject("thyme", new FuckingThymeleaf());
    }

    @PostMapping("create")
    public ModelAndView create(final FuckingThymeleaf fuckingThymeleaf) {
        return new ModelAndView("thymepage").addObject("thyme", new FuckingThymeleaf());
    }
}
