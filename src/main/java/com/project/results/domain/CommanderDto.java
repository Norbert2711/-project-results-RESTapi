package com.project.results.domain;

public class CommanderDto {

    private Long id;
    private Long login;
    private String name;
    private String lastName;
    private Long pluton_number;
    private Cop cop;

    public CommanderDto(Long id, Long login, String name, String lastName, Long pluton_number) {
        this.id=id;
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

    public Cop getCop() {
        return cop;
    }

    public void setCop(Cop cop) {
        this.cop = cop;
    }
}

