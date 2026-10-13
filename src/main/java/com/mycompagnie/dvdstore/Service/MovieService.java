package com.mycompagnie.dvdstore.Service;

import com.mycompagnie.dvdstore.Repository.GoLiveMovieRepository;
import com.mycompagnie.dvdstore.Repository.MovieRepository;
import com.mycompagnie.dvdstore.Repository.MovieRepositoryInterface;
import com.mycompagnie.dvdstore.entity.Movie;

public class MovieService implements MovieServiceInterface {

    public MovieRepositoryInterface getGoLiveMovieRepository() {
        return goLiveMovieRepository;
    }

    public void setGoLiveMovieRepository(MovieRepositoryInterface goLiveMovieRepository) {
        this.goLiveMovieRepository = goLiveMovieRepository;
    }

    private MovieRepositoryInterface goLiveMovieRepository;
    public void registerMovie (Movie movie) {
        goLiveMovieRepository.add(movie);

    }
}
