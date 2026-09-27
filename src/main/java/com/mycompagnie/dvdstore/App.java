package com.mycompagnie.dvdstore;

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

        System.out.println( "Veuillez saisir le nom du film" );
        Scanner scNom = new Scanner(System.in);
        String nom = scNom.nextLine();

        System.out.println( "Veuillez saisir le genre du film" );
        Scanner scGenre = new Scanner(System.in);
        String genre = scGenre.nextLine();

        Movie movie = new Movie();
        movie.setGenre(genre);
        movie.setTitle(nom);
        MovieService film = new MovieService();
        film.registerMovie(movie);



    }
}
