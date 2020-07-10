package com.project.results.controller;


import com.project.results.domain.Commander;
import com.project.results.domain.CommanderDto;
import com.project.results.mapper.CommanderMapper;
import com.project.results.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/commander/")

public class CommanderController {

    @Autowired
    private CommanderMapper commanderMapper;

    @Autowired
    private ResService resService;

    @RequestMapping(method = RequestMethod.GET, value = "getCommanders")
    public List<CommanderDto> getCommanders() {
        return commanderMapper.mapCommanderDtoToList(resService.getAllCommanders());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getCommander")
    public CommanderDto getCommander(@RequestParam final Long commanderId) throws CommanderNotFoundException {
        return commanderMapper.mapToCommanderDto(resService.getCommander(commanderId).orElseThrow(CommanderNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.GET, value = "updateCommander")
    public CommanderDto updateCommander(@RequestBody CommanderDto commanderDto) {
        return commanderMapper.mapToCommanderDto(resService.saveCommander(commanderMapper.mapToCommander(commanderDto)));
    }

    @RequestMapping(method = RequestMethod.GET, value = "deleteCommander")
    public void deleteCommander(@RequestParam Long commanderId) {
        resService.deleteCop(commanderId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "createCommander", consumes = APPLICATION_JSON_VALUE)
    public void createCommander(@RequestBody CommanderDto commanderDto) {
        resService.saveCommander(commanderMapper.mapToCommander(commanderDto));
    }

}
