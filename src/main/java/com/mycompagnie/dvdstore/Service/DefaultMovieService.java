package com.mycompagnie.dvdstore.Service;

import com.mycompagnie.dvdstore.Repository.MovieRepositoryInterface;
import com.mycompagnie.dvdstore.entity.Movie;

public class DefaultMovieService implements MovieServiceInterface {

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
