package com.project.results.repository;

import com.project.results.domain.Results;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ResultsRepository extends CrudRepository<Results, Long> {

    @Override
    List<Results> findAll();

    @Override
    Results save(Results results);

    @Override
    Optional<Results> findById(Long result_id);

    @Override
    long count();

}
