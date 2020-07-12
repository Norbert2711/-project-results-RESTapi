package com.project.results.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "cops")
public class Cop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "position")
    private String position;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "login")
    private String login;

    @Column(name = "pluton_number")
    private Long pluton_number;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cops_result_id")
    private List<Results> resultsList = new ArrayList<>();

    public Cop() {
    }

    public Cop(Long id, String position, String name, String lastName, String login, Long pluton_number) {
        this.id = id;
        this.position = position;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.pluton_number = pluton_number;
    }

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

    public List<Results> getResultsList() {
        return new ArrayList<>(resultsList);
    }

    public void setResultsList(List<Results> resultsList) {
        this.resultsList = resultsList;
    }
}
