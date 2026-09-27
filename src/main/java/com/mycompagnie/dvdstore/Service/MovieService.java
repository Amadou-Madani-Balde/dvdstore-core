package com.mycompagnie.dvdstore.Service;

import com.mycompagnie.dvdstore.Repository.MovieRepository;
import com.mycompagnie.dvdstore.entity.Movie;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();
    public void registerMovie (Movie movie) {
        movieRepository.add(movie);

    }
}
