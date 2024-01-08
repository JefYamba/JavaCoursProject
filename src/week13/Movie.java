package week13;

import java.util.Comparator;

public class Movie implements Comparable<Movie>{
    private String name;
    private int year;
    private double rating;

    public Movie(String name, double rating, int year) {
        this.setName(name);
        this.setRating(rating);
        this.setYear(year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Movie otherMovie) {
//        return this.year - otherMovie.year;
        return Integer.compare(this.year, otherMovie.year);
    }
}

class RatingCompare implements Comparator<Movie>{
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return Double.compare(movie1.getRating(), movie2.getRating());
    }
}

class NameCompare implements Comparator<Movie>{
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getName().compareTo(movie2.getName());
    }
}
