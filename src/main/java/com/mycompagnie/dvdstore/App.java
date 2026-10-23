package com.mycompagnie.dvdstore;

import com.mycompagnie.dvdstore.Controller.MovieController;
import com.mycompagnie.dvdstore.Repository.FileMovieRepository;
import com.mycompagnie.dvdstore.Service.DefaultMovieService;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieController movieController=context.getBean(MovieController.class);
        movieController.addUsingConsole();
    }
}
