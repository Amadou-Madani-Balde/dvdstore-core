package com.mycompagnie.dvdstore.Repository;

import com.mycompagnie.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository implements MovieRepositoryInterface{

    public void add (Movie movie) {

        FileWriter writer;
        try{
            writer=new FileWriter("C:\\temp\\movies.txt",true);
            writer.write(movie.getTitle()  +"\n" );
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Le film est bien ajoute");
    }
}
