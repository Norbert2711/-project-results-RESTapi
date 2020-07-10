package com.project.results.repository;

import com.project.results.domain.Commander;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CommanderRepository  extends CrudRepository<Commander, Long> {

    @Override
    List<Commander> findAll();

    @Override
    Commander save(Commander commander);

    @Override
    Optional<Commander> findById(Long commander_id);

    @Override
    long count();





}
