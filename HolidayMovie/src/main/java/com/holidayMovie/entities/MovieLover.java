package com.holidayMovie.entities;

/**
 * Created by icarusvolans on 11/23/16.
 */
public class MovieLover {

    private String movieLoverId;
    private String title;
    private String year;
    private String holiday;

    public MovieLover(String movieLoverId, String title, String year, String holiday) {
        this.movieLoverId = movieLoverId;
        this.title = title;
        this.year = year;
        this.holiday = holiday;

    }

    public MovieLover() {

    }

    public String getMovieLoverId() {
        return movieLoverId;
    }

    public void setMovieLoverId(String movieLoverId) {
        this.movieLoverId = movieLoverId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {this.holiday = holiday;
    }
}
