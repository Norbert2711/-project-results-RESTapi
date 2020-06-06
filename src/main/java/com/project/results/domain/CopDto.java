package com.project.results.domain;

import lombok.*;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@AllArgsConstructor

public class CopDto {

    private Long id;
    private String name;
    private String lastName;
    private Long login;
}
