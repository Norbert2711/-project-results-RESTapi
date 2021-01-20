package com.project.results.service;


import com.project.results.domain.Commander;
import com.project.results.domain.Cop;
import com.project.results.domain.Pluton;
import com.project.results.domain.Results;
import com.project.results.repository.CommanderRepository;
import com.project.results.repository.CopRepository;
import com.project.results.repository.PlutonRepository;
import com.project.results.repository.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResService {


    private ResultsRepository resultsRepository;


    private CopRepository copRepository;


    private CommanderRepository commanderRepository;


    private PlutonRepository plutonRepository;

    //RESULTS

    public List<Results> getAllResults() {
        return resultsRepository.findAll();
    }

    public Results getResultById(final Long id) {
        return resultsRepository.findById(id).orElse(null);
    }

    public Results saveResult(final Results result) {
        return resultsRepository.save(result);
    }

    public Optional<Results> getResult(final Long id) {
        return resultsRepository.findById(id);
    }

    public void deleteResult(final Long id) {
        resultsRepository.deleteById(id);
    }

    //COP

    public List<Cop> getAllCops() {
        return copRepository.findAll();
    }

    public Cop getCopById(final Long copId) {
        return copRepository.findById(copId).orElse(null);
    }

    public Cop saveCop(final Cop cop) {
        return copRepository.save(cop);
    }

    public Optional<Cop> getCop(final Long copId) {
        return copRepository.findById(copId);
    }

    public void deleteCop(final Long copId) {
        copRepository.deleteById(copId);
    }

    //COMMANDER

    public List<Commander> getAllCommanders() {
        return commanderRepository.findAll();
    }

    public Commander getCommanderById(final Long commander_id) {
        return commanderRepository.findById(commander_id).orElse(null);
    }

    public Commander saveCommander(final Commander commander) {
        return commanderRepository.save(commander);
    }

    public Optional<Commander> getCommander(final Long commander_id) {
        return commanderRepository.findById(commander_id);
    }

    public void deleteCommander(final Long commander_id) {
        commanderRepository.deleteById(commander_id);
    }

    //PLUTON  ---- ONLY *GET*

    public List<Pluton> getAllInformationAboutPluton(){
        return plutonRepository.findAll();
    }

    public Optional<Pluton> getPluton(final Long pluton_id){
        return plutonRepository.findById(pluton_id);
    }
}

