package com.project.results.mapper;

import com.project.results.domain.Cop;
import com.project.results.domain.CopDto;
import com.project.results.domain.Results;
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
                copDto.getLogin()

        );
    }

    public CopDto mapToCopDto(final Cop cop) {
        CopDto copDto = new CopDto(
                cop.getId(),
                cop.getName(),
                cop.getLastName(),
                cop.getLogin()
        );
        copDto.setResultsDtoList(copDto.getResultsDtoList());
        return copDto;
    }

    public List<CopDto> mapCopDtoToList(final List<Cop> copsList) {
        return copsList.stream()
                .map(c -> new CopDto(
                        c.getId(),
                        c.getName(),
                        c.getLastName(),
                        c.getLogin())).
                        collect(Collectors.toList());

    }
}
