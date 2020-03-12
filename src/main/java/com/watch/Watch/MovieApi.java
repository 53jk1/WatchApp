package com.watch.Watch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieApi {

    @Autowired
    private MovieManager movieManager;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/getMovies")
    public String getMovies(){
        return movieManager.getMovieList();
    }

}
