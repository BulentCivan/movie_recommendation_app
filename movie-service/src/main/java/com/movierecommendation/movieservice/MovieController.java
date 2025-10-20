package com.movierecommendation.movieservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/api/movies/test")
    public String test() {
        System.out.println("Movie Service is working!");
        return "Movie Service is working!";
    }
}
