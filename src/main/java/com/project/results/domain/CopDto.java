package com.project.results.domain;

import lombok.*;



public class CopDto {

    private Long id;
    private String name;
    private String lastName;
    private Long login;

    public CopDto(Long id, String name, String lastName, Long login) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
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

    public Long getLogin() {
        return login;
    }
}
