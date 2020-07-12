package com.project.results.domain;

import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
public class CopDto {

    private Long id;
    private String position;
    private String name;
    private String lastName;
    private String login;
    private Long pluton_number;
    private List<ResultsDto> resultsDtoList;

    public Long getId() {
        return id;
    }

    public String getPosition() {
        return position;
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

    public Long getPluton_number() {
        return pluton_number;
    }

    public List<ResultsDto> getResultsDtoList() {
        return resultsDtoList;
    }

    public void setResultsDtoList(List<ResultsDto> resultsDtoList) {
        this.resultsDtoList = resultsDtoList;
    }

    public CopDto() {
    }

    public CopDto(Long id, String position, String name, String lastName, String login, Long pluton_number) {
        this.id = id;
        this.position = position;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.pluton_number = pluton_number;
    }

}
