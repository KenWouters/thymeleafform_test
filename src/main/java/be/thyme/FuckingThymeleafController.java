package be.thyme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path="/" )
public class FuckingThymeleafController {

    @GetMapping("thyme")
    public ModelAndView showThyme(final HttpServletRequest request) {
        return new ModelAndView("thymepage").addObject("thyme", new FuckingThymeleaf());
    }

    @PostMapping("create")
    public ModelAndView create(final FuckingThymeleaf fuckingThymeleaf) {
        return new ModelAndView("thymepage").addObject("thyme", new FuckingThymeleaf());
    }

    @PostMapping(value = "create", params = {"addChild"})
    public ModelAndView addChild(final FuckingThymeleaf fuckingThymeleaf) {
        fuckingThymeleaf.getKids().add(new FuckingThymeleafChild());

        return new ModelAndView("thymepage").addObject("thyme", fuckingThymeleaf);
    }
}
