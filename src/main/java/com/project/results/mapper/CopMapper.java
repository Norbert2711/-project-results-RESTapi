package com.project.results.mapper;

import com.project.results.domain.Cop;
import com.project.results.domain.CopDto;
import com.project.results.domain.ResultsDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CopMapper {

    public Cop mapToCop(final CopDto copDto) {
        return new Cop(
                copDto.getId(),
                copDto.getName(),
                copDto.getLastName(),
                copDto.getLogin(),
                (ResultsDto) copDto.getResultsDtoList()
        );
    }

    public CopDto mapToCopDto(final Cop cop) {
        return new CopDto(
                cop.getId(),
                cop.getName(),
                cop.getLastName(),
                cop.getLogin(),
                cop.getResultsDtoList()
        );
    }

    public List<CopDto> mapCopDtoToList(final List<Cop> copsList) {
        return copsList.stream()
                .map(c -> new CopDto(
                        c.getId(),
                        c.getName(),
                        c.getLastName(),
                        c.getLogin(),
                        c.getResultsDtoList()))
                .collect(Collectors.toList());

    }
}
