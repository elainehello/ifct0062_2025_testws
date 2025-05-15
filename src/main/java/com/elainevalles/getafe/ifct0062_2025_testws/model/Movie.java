package com.elainevalles.getafe.ifct0062_2025_testws.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    private Integer id;
    private String title;
    private String genre;
    private String url;
    private int year;

    public Movie() {
    }

    public Movie(String title, String genre, String url, int year) {
        this.title = title;
        this.genre = genre;
        this.url = url;
        this.year = year;
    }

    public Movie(Integer id, String title, String genre, String url, int year) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.url = url;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", url='" + url + '\'' +
                ", year=" + year +
                '}';
    }
}
