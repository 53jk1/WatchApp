package com.watch.Watch;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieManager {

    private List<Movie> movieList;

    public MovieManager(){
        this.movieList = new ArrayList<>();
        movieList.add(new Movie("The Shawshank Redemption", 1994, 8.75));
        movieList.add(new Movie("Intouchables", 2011, 8.63));
        movieList.add(new Movie("The Green Mile", 1999, 8.61));
        movieList.add(new Movie("The Godfather", 1972, 8.59));
        movieList.add(new Movie("12 Angry Men", 1957, 8.54));
        movieList.add(new Movie("Forrest Gump", 1994, 8.52));
        movieList.add(new Movie("One Flew Over the Cuckoo's Nest", 1975, 8.44));
        movieList.add(new Movie("The Godfather: Part II", 1974, 8.39));
        movieList.add(new Movie("Joker", 2019, 8.34));
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }
}
