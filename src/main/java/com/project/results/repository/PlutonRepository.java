package com.project.results.repository;

import com.project.results.domain.Pluton;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PlutonRepository extends CrudRepository <Pluton,Long > {

    @Override
    List<Pluton> findAll();

    @Override
    Optional<Pluton> findById(Long pluton_id);

}
