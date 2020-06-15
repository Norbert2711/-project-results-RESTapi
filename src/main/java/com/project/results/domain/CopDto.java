package com.project.results.domain;

import java.util.List;

public class CopDto {

    private Long id;
    private String name;
    private String lastName;
    private String login;
    private List<ResultsDto> resultsDtoList;

    public CopDto(Long id, String name, String lastName, String login, String resultsDtoList) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.resultsDtoList = getResultsDtoList();

    }

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

    public List<ResultsDto> getResultsDtoList() {
        return resultsDtoList;
    }
}
