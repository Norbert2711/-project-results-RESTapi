package com.project.results.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "COMANDER")
public class Commander {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commanders_id")
    private Long id;

    @Column(name = "position")
    private String position;

    @Column(name = "login")
    private Long login;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "pluton_number")
    private Long pluton_number;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "command_id")
    private List<Cop> cop = new ArrayList<>();

    public Commander(Long id,String position, Long login, String name, String lastName, Long pluton_number) {
        this.id = id;
        this.position = position;
        this.login = login;
        this.name = name;
        this.lastName = lastName;
        this.pluton_number = pluton_number;

    }

    public Commander() {
    }


    public Long getId() {
        return id;
    }

    public String getPosition() {
        return position;
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

    public List<Cop> getCop() {
        return new ArrayList<>(cop);
    }

    public void setCop(List<Cop> cop) {
        this.cop = cop;
    }
}
