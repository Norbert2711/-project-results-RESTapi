package com.project.results.domain;

import java.util.List;

public class CommanderDto {

    private Long id;
    private String position;
    private Long login;
    private String name;
    private String lastName;
    private Long pluton_number;
    private List<CopDto> copDtoList;

    public CommanderDto(Long id,String position, Long login, String name, String lastName, Long pluton_number) {
        this.id=id;
        this.position = position;
        this.login = login;
        this.name = name;
        this.lastName = lastName;
        this.pluton_number = pluton_number;

    }

    public CommanderDto() {
    }

    public Long getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }


    public Long getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getPluton_number() {
        return pluton_number;
    }

    public List<CopDto> getCopDtoList() {
        return copDtoList;
    }

    public void setCopDtoList(List<CopDto> copDtoList) {
        this.copDtoList = copDtoList;
    }
}

