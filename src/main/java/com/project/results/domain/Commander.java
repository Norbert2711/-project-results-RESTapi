package com.project.results.domain;


import javax.persistence.*;

@Entity(name = "COMANDER")
public class Commander {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commander_id")
    private Long id;

    @Column(name = "login")
    private Long login;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "pluton_number")
    private Long pluton_number;

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


//    public Cop getCop() {
//        return cop;
//    }

//    public void setCop(Cop cop) {
//        this.cop = cop;
//    }

    public Commander(Long id, Long login, String name, String lastName, Long pluton_number) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.lastName = lastName;
        this.pluton_number = pluton_number;
    }

    public Commander() {
    }
}
