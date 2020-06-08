package com.project.results.domain.controller;


import com.project.results.domain.ResultsDto;
import com.project.results.mapper.ResultsMapper;
import com.project.results.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/results/")
public class ResultsController {

    @Autowired
    private ResService resService;

    @Autowired
    private ResultsMapper resultsMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getResults")
    public List<ResultsDto> getResults() {
        return resultsMapper.mapResultsDtoList(resService.getAllResults());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getResult")
    public ResultsDto getResult(@RequestParam Long resultId) throws ResultNotFoundException {
        return resultsMapper.mapToResultsDto(resService.getResult(resultId).orElseThrow(ResultNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateResult")
    public ResultsDto updateResult(@RequestBody ResultsDto resultsDto) {
        return resultsMapper.mapToResultsDto(resService.saveResult(resultsMapper.mapToResults(resultsDto)));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "getResult")
    public void deleteResult(@RequestParam Long resultId) {
        resService.deleteResult(resultId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "createResult", consumes = APPLICATION_JSON_VALUE)
    public void createResult(@RequestBody ResultsDto resultsDto) {
        resService.saveResult(resultsMapper.mapToResults(resultsDto));
    }

}
