package com.project.results.mapper;

import com.project.results.domain.Commander;
import com.project.results.domain.Cop;
import com.project.results.domain.CopDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CopMapper {

    @Autowired
    private ResultsMapper resultsMapper;

    public Cop mapToCop(final CopDto copDto) {
        return new Cop(
                copDto.getId(),
                copDto.getPosition(),
                copDto.getName(),
                copDto.getLastName(),
                copDto.getLogin(),
                copDto.getPluton_number()

        );
    }

    public CopDto mapToCopDto(final Cop cop) {
        CopDto copDto = new CopDto(
                cop.getId(),
                cop.getPosition(),
                cop.getName(),
                cop.getLastName(),
                cop.getLogin(),
                cop.getPluton_number()
        );
        copDto.setResultsDtoList(resultsMapper.mapResultsDtoList(cop.getResultsList()));
        return copDto;

    }

    public List<CopDto> mapCopDtoToList(final List<Cop> copsList) {
        return copsList.stream()
                .map(this::mapToCopDto)
                .collect(Collectors.toList());

    }
}
