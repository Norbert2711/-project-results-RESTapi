package com.project.results.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
public class ResultsDto {

    private Long id;
    private String place_of_service;
    private String date;
    private String time;
    private String type_of_patrol;
    private String legitimated;
    private String checked_in_the_system;
    private String quotations;
    private String interventions;
    private String notations;
    private String mandates;
    private String vehicle_controls;
    private String arrested;
    private String kilometers_traveled;
    private List<CopDto> copDtoList;

    public ResultsDto(Long id, String place_of_service, String date, String time, String type_of_patrol, String legitimated, String checked_in_the_system, String quotations, String interventions, String notations, String mandates, String vehicle_controls, String arrested, String kilometers_traveled) {
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

    public ResultsDto() {
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

    public List<CopDto> getCopDtoList() {
        return copDtoList;
    }

    public void setCopDtoList(List<CopDto> copDtoList) {
        this.copDtoList = copDtoList;
    }
}

