package com.elainevalles.getafe.ifct0062_2025_testws.Repository;

import com.elainevalles.getafe.ifct0062_2025_testws.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IGenreRepository extends JpaRepository<Genre, Integer> {
}
