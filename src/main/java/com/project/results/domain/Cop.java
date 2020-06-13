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
    private Long login;

    public Cop(Long id, String name, String lastName, Long login) {
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

    public Cop() {
    }

}
