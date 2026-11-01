package com.mycompagnie.dvdstore.Repository;

import com.mycompagnie.dvdstore.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {

    public void add (Movie movie);

    public List<Movie> list();
}
