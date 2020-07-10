package com.project.results.controller;


import com.project.results.domain.Pluton;
import com.project.results.domain.PlutonDto;
import com.project.results.mapper.PlutonMapper;
import com.project.results.repository.PlutonRepository;
import com.project.results.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/pluton/")
public class PlutonController {

    @Autowired
    private ResService resService;

    @Autowired
    private PlutonMapper plutonMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getPlutons")
    public List<PlutonDto> getPlutons(){
        return plutonMapper.mapToPlutonDtoList(resService.getAllInformationAboutPluton());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getPluton")
    public PlutonDto getPluton(final Long pluton_id) throws PlutonThrowException {
        return plutonMapper.mapToPlutonDto(resService.getPluton(pluton_id).orElseThrow(PlutonThrowException::new));
    }

}
