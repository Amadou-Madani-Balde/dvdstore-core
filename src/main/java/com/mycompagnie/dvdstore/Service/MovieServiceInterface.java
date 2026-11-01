package com.mycompagnie.dvdstore.Service;

import com.mycompagnie.dvdstore.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {

    public void registerMovie(Movie movie);

    public List<Movie> getMovieList();
}
