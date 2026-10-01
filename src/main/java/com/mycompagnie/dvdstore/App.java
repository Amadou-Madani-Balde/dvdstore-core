package com.mycompagnie.dvdstore;

import com.mycompagnie.dvdstore.Controller.MovieController;
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
        movieController.addUsingConsole();
    }
}
