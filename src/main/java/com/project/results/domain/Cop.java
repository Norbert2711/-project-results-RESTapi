package com.project.results.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
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

    @OneToMany(mappedBy = "cop", fetch = FetchType.LAZY)
    private List<Results> results = new ArrayList<>();

    public Cop() {
    }

    public Cop(Long id, String name, String lastName, String login) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
    }

    public Long getId() { return id; }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public List<Results> getResults() {
        return new ArrayList<>(results);
    }
}
