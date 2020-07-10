package com.project.results.domain;

public class PlutonDto {

    private Long id;
    private String name;
    private Long id_commander;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getId_commander() {
        return id_commander;
    }

    public PlutonDto(Long id, String name, Long id_commander) {
        this.id = id;
        this.name = name;
        this.id_commander = id_commander;
    }

    public PlutonDto() {
    }
}
