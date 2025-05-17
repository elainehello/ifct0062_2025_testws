package com.elainevalles.getafe.ifct0062_2025_testws.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tmovies")
@NamedQuery(
        name = "findByDirector",
        query = "FROM Movie mv  WHERE mv.director = :director"
)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idgenre", nullable = false)
    private Genre genre;
    private String title;
    private String director;
    private int year;
    private String poster;

}
