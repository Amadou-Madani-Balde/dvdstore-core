package com.mycompagnie.dvdstore;

import com.mycompagnie.dvdstore.Controller.MovieController;
import com.mycompagnie.dvdstore.Repository.GoLiveMovieRepository;
import com.mycompagnie.dvdstore.Repository.MovieRepository;
import com.mycompagnie.dvdstore.Service.MovieService;
import com.mycompagnie.dvdstore.entity.Movie;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        MovieService movieService = new MovieService();
        GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
        movieService.setGoLiveMovieRepository(movieRepository);
        movieController.setMovieService(movieService);
        movieController.addUsingConsole();
    }
}
