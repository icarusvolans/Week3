package com.holidayMovie.listeners;

import com.holidayMovie.data.DataCacheJson;
import com.holidayMovie.entities.MovieLover;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.*;
import java.util.ArrayList;

/**
 * Created by icarusvolans on 11/27/16.
 */
public class ContextListener implements ServletContextListener{


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Starting up!");

 //       String jspName = "viewAllMovieLovers";


        ServletContext ctx = servletContextEvent.getServletContext();
        System.out.println(ctx.getClassLoader());
        ArrayList<MovieLover> movieLovers = DataCacheJson.getMovieLovers();
        ctx.setAttribute("movieLovers",movieLovers);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

}
