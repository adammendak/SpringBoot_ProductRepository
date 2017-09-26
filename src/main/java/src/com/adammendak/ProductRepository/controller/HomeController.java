package src.com.adammendak.ProductRepository.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(path = "/")
    public String index() {
        return "index";
    }

}
