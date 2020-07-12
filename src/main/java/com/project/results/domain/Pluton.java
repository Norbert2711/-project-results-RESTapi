package com.project.results.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity(name = "PLUTON")
public class Pluton {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pluton_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "id_comander_in_pluton")
    private List<Commander> commanderList;


    public Pluton(long id, String name) {
        this.id=id;
        this.name=name;
    }

    public Pluton() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Commander> getCommanderList() {
        return commanderList;
    }

    public void setCommanderList(List<Commander> commanderList) {
        this.commanderList = commanderList;
    }
}
