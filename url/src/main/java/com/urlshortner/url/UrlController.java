package com.urlshortner.url;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;


@Controller
// @RestController
@RequestMapping("/api/url")

public class UrlController {
    @GetMapping("/")
    public String empty() {
        return "this is just /";
    }

    @GetMapping("/home")
    public String home() {
        return "home"; // maps to home.html in templates
    }

    @GetMapping("/maker")
    public String maker() {
        return "maker";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "This is the URL Dashboard Page.";
    }
}