package com.urlshortner.url;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/url")


public class UrlController {
    @GetMapping("/")
    public String home() {
        return "Welcome to the API!";
    }
    @RequestMapping("/test")
    public String test() {
        return "URL Shortener API is working!";
    }
}