package com.elainevalles.getafe.ifct0062_2025_testws.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.elainevalles.getafe.ifct0062_2025_testws.model.Movie;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IMovieRepository extends JpaRepository<Movie, Integer> {
}