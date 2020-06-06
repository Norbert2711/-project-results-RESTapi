package com.project.results.domain;

import lombok.*;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@AllArgsConstructor

public class CommanderDto {

    private Long login;
    private String name;
    private String lastName;
    private Long password;

}

