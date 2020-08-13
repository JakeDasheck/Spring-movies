package com.jakes.movies.model;

public class Movie {
    private Integer id;
    private String name;
    private String rating;
    private String genre;
    private Producent producent;

    public Movie(Integer id, String name, String rating, String genre, Producent producent) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.producent = producent;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating='" + rating + '\'' +
                ", genre='" + genre + '\'' +
                ", producent=" + producent +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public Producent getProducent() {
        return producent;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }
}
