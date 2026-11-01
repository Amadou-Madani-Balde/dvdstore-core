package com.mycompagnie.dvdstore.Controller;

import com.mycompagnie.dvdstore.Service.DefaultMovieService;
import com.mycompagnie.dvdstore.Service.MovieServiceInterface;
import com.mycompagnie.dvdstore.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {


    @Autowired
    private MovieServiceInterface movieService;

    @RequestMapping("/dvdstore-home")
    public  @ModelAttribute("movies") List<Movie> displayHome () {
        return movieService.getMovieList();
    }
}
