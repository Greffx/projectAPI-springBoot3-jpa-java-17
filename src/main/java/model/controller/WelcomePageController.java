package model.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePageController {

    @RequestMapping("/")
    public String helloMethod() {
        return "It's working";
    }
}
