package com.project.results.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Entity(name = "results")
public class Results {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "result_id")
    private Long id;

    @Column(name = "cop_id")
    private Long cop_id;

    @Column(name = "place_of_service")
    private String place_of_service;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    @Column(name = "type_of_patrol")
    private String type_of_patrol;

    @Column(name = "legitimated")
    private int legitimated;

    @Column(name = "checked_in_the_system")
    private int checked_in_the_system;

    @Column(name = "quotations")
    private int quotations;

    @Column(name = "interventions")
    private int interventions;

    @Column(name = "noticions")
    private int noticions;

    @Column(name = "mandates")
    private int mandates;

    @Column(name = "vehicle_controls")
    private int vehicle_controls;

    @Column(name = "arrested")
    private int arrested;

    @Column(name = "kilometers_traveled")
    private int kilometers_traveled;


    public Results(Long id, Long cop_id, String date, String time, String type_of_patrol, int legitimated, int checked_in_the_system, int quotations, int interventions, int noticions, int mandates, int vehicle_controls, int arrested, int kilometers_traveled) {
    }
}
