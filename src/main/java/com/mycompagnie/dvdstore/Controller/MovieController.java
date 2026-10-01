package com.mycompagnie.dvdstore.Controller;

import com.mycompagnie.dvdstore.Service.MovieService;
import com.mycompagnie.dvdstore.entity.Movie;

import java.util.Scanner;

public class MovieController {

    private MovieService movieService = new MovieService();

    public void addUsingConsole () {

        System.out.println( "Veuillez saisir le nom du film" );
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();

        System.out.println( "Veuillez saisir le genre du film" );
        String genre = sc.nextLine();

        Movie movie = new Movie();
        movie.setGenre(genre);
        movie.setTitle(nom);
        movieService.registerMovie(movie);
    }
}

