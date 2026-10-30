package com.mycompagnie.dvdstore.Service;

import com.mycompagnie.dvdstore.entity.Movie;
import com.mycompagnie.dvdstore.Repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultMovieService implements MovieServiceInterface{

    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){

        movieRepository.add(movie);
    }
}