package com.project.results.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity(name = "PLUTON")
public class Pluton {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pluton_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "id_comander")
    private Long id_commander;

    public Pluton(long id, String name, long id_commander) {
        this.id=id;
        this.name=name;
        this.id_commander=id_commander;
    }

    public Pluton() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getId_commander() {
        return id_commander;
    }
}
