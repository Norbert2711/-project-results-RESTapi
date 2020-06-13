package com.project.results.domain.controller;

import com.project.results.domain.Cop;
import com.project.results.domain.CopDto;
import com.project.results.mapper.CopMapper;
import com.project.results.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/cops/")
public class CopController {

    @Autowired
    private ResService resService;

    @Autowired
    private CopMapper copMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getCops")
    public List<CopDto> getCops() {
        return copMapper.mapCopDtoToList(resService.getAllCops());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getCop")
    public CopDto getCop(@RequestParam Long copId) throws CopNotFoundException, ResultNotFoundException {
        return copMapper.mapToCopDto(resService.getCop(copId).orElseThrow(ResultNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateCop")
    public CopDto updateCop(@RequestBody CopDto copDto) {
        return copMapper.mapToCopDto(resService.saveCop(copMapper.mapToCop(copDto)));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteCop")
    public void deleteCop(@RequestParam Long copId) {
        resService.deleteCop(copId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "createCop", consumes = APPLICATION_JSON_VALUE)
    public void createCop(@RequestBody CopDto copDto) {
        resService.saveCop(copMapper.mapToCop(copDto));
    }
}
