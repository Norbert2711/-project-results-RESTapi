package com.project.results.domain;


import javax.persistence.*;

@Entity(name = "cops")
public class Cop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "login")
    private String login;

    @Column (name ="results")
    private ResultsDto resultsDtoList;

    public Cop(Long id, String name, String lastName, String login, ResultsDto resultsDtoList) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.resultsDtoList = resultsDtoList;
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

    public ResultsDto getResultsDtoList() { return resultsDtoList; }

    public Cop() {
    }

}
