package com.project.results.domain;


import javax.persistence.*;

@Entity(name = "results")
public class Results {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "result_id")
    private Long id;

    @Column(name = "place_of_service")
    private String place_of_service;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    @Column(name = "type_of_patrol")
    private String type_of_patrol;

    @Column(name = "legitimated")
    private String legitimated;

    @Column(name = "checked_in_the_system")
    private String checked_in_the_system;

    @Column(name = "quotations")
    private String quotations;

    @Column(name = "interventions")
    private String interventions;

    @Column(name = "noticions")
    private String notations;

    @Column(name = "mandates")
    private String mandates;

    @Column(name = "vehicle_controls")
    private String vehicle_controls;

    @Column(name = "arrested")
    private String arrested;

    @Column(name = "kilometers_traveled")
    private String kilometers_traveled;


    public Results(Long id, String place_of_service, String date, String time, String type_of_patrol, String legitimated, String checked_in_the_system, String quotations, String interventions, String notations, String mandates, String vehicle_controls, String arrested, String kilometers_traveled) {
        this.id = id;
        this.place_of_service = place_of_service;
        this.date = date;
        this.time = time;
        this.type_of_patrol = type_of_patrol;
        this.legitimated = legitimated;
        this.checked_in_the_system = checked_in_the_system;
        this.quotations = quotations;
        this.interventions = interventions;
        this.notations = notations;
        this.mandates = mandates;
        this.vehicle_controls = vehicle_controls;
        this.arrested = arrested;
        this.kilometers_traveled = kilometers_traveled;

    }

    public Results() {
    }

    public Long getId() {
        return id;
    }

    public String getPlace_of_service() {
        return place_of_service;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getType_of_patrol() {
        return type_of_patrol;
    }

    public String getLegitimated() {
        return legitimated;
    }

    public String getChecked_in_the_system() {
        return checked_in_the_system;
    }

    public String getQuotations() {
        return quotations;
    }

    public String getInterventions() {
        return interventions;
    }

    public String getNotations() {
        return notations;
    }

    public String getMandates() {
        return mandates;
    }

    public String getVehicle_controls() {
        return vehicle_controls;
    }

    public String getArrested() {
        return arrested;
    }

    public String getKilometers_traveled() {
        return kilometers_traveled;
    }

}
