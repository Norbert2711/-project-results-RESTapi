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
    private List<ResultsDto> resultsDtoList = new ArrayList<>();

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

    public CopDto() {
    }

    public CopDto(Long id, String name, String lastName, String login) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
    }

    public void setResultsDtoList(List<ResultsDto> resultsDtoList) {
        this.resultsDtoList = resultsDtoList;
    }
}
