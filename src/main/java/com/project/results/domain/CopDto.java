package com.project.results.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class CopDto {

    private Long id;
    private String name;
    private String lastName;
    private String login;
    private List<ResultsDto> resultsDtoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<ResultsDto> getResultsDtoList() {
        return resultsDtoList;
    }

    public void setResultsDtoList(List<ResultsDto> resultsDtoList) {
        this.resultsDtoList = resultsDtoList;
    }
}
