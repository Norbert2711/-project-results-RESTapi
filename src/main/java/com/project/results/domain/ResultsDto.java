package com.project.results.domain;

import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ResultsDto {

    private Long id;
    private Long cop_id;
    private String place_of_service;
    private String date;
    private String time;
    private String type_of_patrol;
    private int legitimated;
    private int checked_in_the_system;
    private int quotations;
    private int interventions;
    private int noticions;
    private int mandates;
    private int vehicle_controls;
    private int arrested;
    private int kilometers_traveled;

    public ResultsDto(Long id, Long cop_id, String date, String time, String type_of_patrol, int legitimated, int checked_in_the_system, int quotations, int interventions, int noticions, int mandates, int vehicle_controls, int arrested, int kilometers_traveled) {
    }
}
