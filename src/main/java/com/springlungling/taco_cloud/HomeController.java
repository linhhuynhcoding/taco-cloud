package com.springlungling.taco_cloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/src/main/resources/templates/home.html")
    public String home(){

        return "My home!";
    }
}
