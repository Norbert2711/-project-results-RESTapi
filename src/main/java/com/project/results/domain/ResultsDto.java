package com.project.results.domain;

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
    private String rest_day;
    private String holiday;
    private String sick_leave;

    // private CopDto copDto;

    public ResultsDto(Long id, String place_of_service, String date, String time, String type_of_patrol, String legitimated, String checked_in_the_system, String quotations, String interventions, String notations,
                      String mandates, String vehicle_controls, String arrested, String kilometers_traveled,String rest_day, String holiday, String sick_leave) {
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
        this.rest_day=rest_day;
        this.holiday = holiday;
        this.sick_leave = sick_leave;

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

    public String getRest_day() {
        return rest_day;
    }

    public String getHoliday() {
        return holiday;
    }

    public String getSick_leave() {
        return sick_leave;
    }

    //    public CopDto getCopDto() {
//        return copDto;
//    }
//
//    public void setCopDto(CopDto copDto) {
//        this.copDto = copDto;
//    }
}
