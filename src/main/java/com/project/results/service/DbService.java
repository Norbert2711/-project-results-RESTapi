package com.project.results.service;


import com.project.results.domain.Results;
import com.project.results.repository.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {

    @Autowired
    private ResultsRepository resultsRepository;

    public List<Results> getAllResults() {
        return resultsRepository.findAll();
    }

    public Results getResultById(final Long id) {
        return resultsRepository.findById(id).orElse(null);

    }

    public Results saveResult(final Results results) {
        return resultsRepository.save(results);
    }

    public Optional<Results> getResult(final Long id) {
        return resultsRepository.findById(id);
    }

    public void deleteResult(final Long id) {
        resultsRepository.deleteById(id);
    }
}
