package com.holidayMovie.servlets;

import com.holidayMovie.data.DataCacheJson;
import com.holidayMovie.entities.MovieLover;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by icarusvolans on 11/23/16.
 */
public class CustomerController extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String uri = request.getRequestURI();
        System.out.println("Requested URI: " + uri);

        String jspName = uri.substring(uri.lastIndexOf('/') + 1);
        System.out.println("JSP Name: " + jspName);

        if(jspName.equalsIgnoreCase("viewAllMovieLovers")) {
            ArrayList<MovieLover> movieLovers = DataCacheJson.getMovieLovers();
            System.out.println(movieLovers.size());
            request.setAttribute("movieLovers",movieLovers);
        } else if(jspName.equalsIgnoreCase("viewMovie") || jspName.equalsIgnoreCase("editMovie")) {
            String movieLoverId = request.getParameter("movieLoverid");
            MovieLover movieLover = DataCacheJson.getMovieLover(movieLoverId);
            request.setAttribute("movieLover",movieLover);

        } else if(jspName.equalsIgnoreCase("saveNewMovie")) {
            MovieLover saveHolidayMovie = new MovieLover();
            saveHolidayMovie.setTitle(request.getParameter("title"));
            saveHolidayMovie.setYear(request.getParameter("year"));
            saveHolidayMovie.setHoliday(request.getParameter("holiday"));
            saveHolidayMovie.setMovieLoverId(System.currentTimeMillis()+"-"+saveHolidayMovie.getTitle().charAt(0));
            DataCacheJson.setMovieLover(saveHolidayMovie);
            ArrayList<MovieLover> movieLovers = DataCacheJson.getMovieLovers();
            request.setAttribute("movieLovers",movieLovers);
//            System.out.println("In saveNewMovie: " + movieLovers.size());
            jspName = "viewAllMovieLovers";

        } else if (jspName.equalsIgnoreCase("updateMovie")) {
            String movieLoverId = request.getParameter("movieLoverid");
            MovieLover updateMovie = DataCacheJson.getMovieLover(movieLoverId);
            updateMovie.setTitle(request.getParameter("title"));
            updateMovie.setYear(request.getParameter("year"));
            updateMovie.setHoliday(request.getParameter("holiday"));
            DataCacheJson.setMovieLover(updateMovie);
            ArrayList<MovieLover> movieLovers = DataCacheJson.getMovieLovers();
            request.setAttribute("movieLovers",movieLovers);
//            System.out.println("In editNewMovie: " + movieLovers.size());
            jspName = "viewAllMovieLovers";
        }
        RequestDispatcher view = request.getRequestDispatcher("/customers/"+jspName+".jsp");
        view.forward(request, response);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doPost(request,response);
    }
}