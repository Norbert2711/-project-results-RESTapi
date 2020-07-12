package com.project.results.domain;

import java.util.List;

public class PlutonDto {

    private Long id;
    private String name;
    private List<CommanderDto> commanderDtoList;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<CommanderDto> getCommanderDtoList() {
        return commanderDtoList;
    }

    public void setCommanderDtoList(List<CommanderDto> commanderDtoList) {
        this.commanderDtoList = commanderDtoList;
    }

    public PlutonDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public PlutonDto() {
    }
}
