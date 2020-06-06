package com.project.results.domain.controller;


import com.project.results.mapper.ResultsMapper;
import com.project.results.service.DbService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class ResultsController {

    private DbService dbService;
    private ResultsMapper resultsMapper;







}
