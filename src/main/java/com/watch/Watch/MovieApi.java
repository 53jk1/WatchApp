package com.watch.Watch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieApi {

    private MovieManager movieManager;

    @Autowired
    public MovieApi(MovieManager movieManager) {
        this.movieManager = movieManager;
    }

    @GetMapping("/movie")
    public List<Movie> getMovies(){
        return movieManager.getMovieList();
    }

    @PostMapping("/movie")
    public boolean addMovie(@RequestBody Movie movie){
        return movieManager.addMovie(movie);
    }
}