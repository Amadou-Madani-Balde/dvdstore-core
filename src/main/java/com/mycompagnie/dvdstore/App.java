package com.mycompagnie.dvdstore;

import com.mycompagnie.dvdstore.Controller.MovieController;
import com.mycompagnie.dvdstore.Repository.FileMovieRepository;
import com.mycompagnie.dvdstore.Service.DefaultMovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        DefaultMovieService movieService = new DefaultMovieService();
        FileMovieRepository movieRepository = new FileMovieRepository();
        movieService.setGoLiveMovieRepository(movieRepository);
        movieController.setMovieService(movieService);
        movieController.addUsingConsole();
    }
}
