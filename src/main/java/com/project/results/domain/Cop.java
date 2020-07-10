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
//@Getter
//@Setter
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

    @Column(name = "pluton_number")
    private Long pluton_number;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Commander commander;

    public Cop() {
    }

    public Cop(Long id, String name, String lastName, String login, Long pluton_number) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.pluton_number = pluton_number;
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

    public Long getPluton_number() { return pluton_number; }

    public Commander getCommander() {
        return commander;
    }

    public void setCommander(Commander commander) {
        this.commander = commander;
    }

    //    public List<Results> getResults() {
//        return new ArrayList<>(results);
//    }

//    public void setResults(List<Results> results) {
//        this.results = results;
//    }
}
