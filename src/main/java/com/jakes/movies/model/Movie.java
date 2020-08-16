package com.jakes.movies.model;

import javax.persistence.*;

@Entity
@Table(name="movies")
public class Movie {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private String name;
    private Integer rating;
    private String genre;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private Producent producent;


    public Movie(Integer id, String name, Integer rating, String genre, Producent producent) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.producent = producent;
    }

    public Movie() {
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

    public Integer getRating() {
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

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }
}
