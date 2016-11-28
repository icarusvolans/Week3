package com.holidayMovie.data;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.holidayMovie.entities.MovieLover;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by icarusvolans on 11/23/16.
 */
public class DataCacheJson {
    private static DataCacheJson instance = null;

    private static HashMap<String, MovieLover> movieLoversHashMap;
    private static Path movieLoversFilePath = Paths.get("/Users/icarusvolans/movieLovers.json");

    private DataCacheJson() {
        // Exists only to defeat instantiation.
    }

    public static synchronized DataCacheJson getInstance() {
        if (instance == null) {
            instance = new DataCacheJson();
        }
        return instance;
    }

    private static void checkLoaded() {
        if (movieLoversHashMap == null || movieLoversHashMap.isEmpty()) {
            loadDataCache();
        }
    }

    public static ArrayList<MovieLover> getMovieLovers() {
        checkLoaded();
        return new ArrayList<>(movieLoversHashMap.values());
    }

    public static MovieLover getMovieLover(String movieLoverId) {
        checkLoaded();
        MovieLover m = null;
        if (movieLoversHashMap.containsKey(movieLoverId)) {
            m = movieLoversHashMap.get(movieLoverId);
        }
        return m;
    }

    public static void setMovieLover(MovieLover m) {
        checkLoaded();
        movieLoversHashMap.put(m.getMovieLoverId() + "", m);
        saveAllToFiles();
    }
// missing something here in setMovieLover that is populating when you click on All Movies

    private static void saveAllToFiles() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(Files.newOutputStream(movieLoversFilePath), movieLoversHashMap);
        } catch (IOException ioe) {
            System.out.println("Sorry, we couldn't save your movie preferences. Please try again.");
            ioe.printStackTrace();
        }
    }

    private static void loadDataCache() {
        if (!Files.exists(movieLoversFilePath)) {
            initialLoadDataCache();
            saveAllToFiles();
        }
        try {
            ObjectMapper mapper = new ObjectMapper();
            movieLoversHashMap = mapper.readValue(Files.newInputStream(movieLoversFilePath), new TypeReference<HashMap<String, MovieLover>>() {
            });
        } catch (IOException ioe) {
            System.out.println("Sorry, we couldn't load your movie preferences. Please try again.");
            ioe.printStackTrace();
        }
    }

    private static void initialLoadDataCache() {
        movieLoversHashMap = new HashMap<>();

        String movieLoverId = System.currentTimeMillis() + "-wc";
        movieLoversHashMap.put(movieLoverId, new MovieLover(movieLoverId, "White Christmas", "1954", "Christmas"));

        movieLoverId = System.currentTimeMillis() + "-nbc";
        movieLoversHashMap.put(movieLoverId, new MovieLover(movieLoverId, "Nightmare Before Christmas", "1993", "Halloween"));

        movieLoverId = System.currentTimeMillis() + "-pa";
        movieLoversHashMap.put(movieLoverId, new MovieLover(movieLoverId, "Pieces of April", "2003", "Thanksgiving"));

        movieLoverId = System.currentTimeMillis() + "-la";
        movieLoversHashMap.put(movieLoverId, new MovieLover(movieLoverId, "Love Actually", "2003", "Christmas"));
    }
}