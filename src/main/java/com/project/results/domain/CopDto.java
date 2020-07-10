package com.project.results.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
public class CopDto {

    private Long id;
    private String name;
    private String lastName;
    private String login;
    private Long pluton_number;
    private CommanderDto commanderDto;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public Long getPluton_number() { return pluton_number; }

    public CopDto() {
    }

    public CopDto(Long id, String name, String lastName, String login, Long pluton_number) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.pluton_number = pluton_number;
    }

    public CommanderDto getCommanderDto() {
        return commanderDto;
    }

    public void setCommanderDto(CommanderDto commanderDto) {
        this.commanderDto = commanderDto;
    }

// public void setResultsDtoList(List<ResultsDto> resultsDtoList) {
       // this.resultsDtoList = resultsDtoList;
    //}
}
