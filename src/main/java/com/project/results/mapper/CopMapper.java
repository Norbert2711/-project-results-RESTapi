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
                copDto.getLogin(),
                copDto.getResultsDtoList()

        );
    }

    public CopDto mapToCopDto(final Cop cop) {
        return new CopDto(
                cop.getId(),
                cop.getName(),
                cop.getLastName(),
                cop.getLogin(),
                cop.setResultsList()
        );
    }

    public List<CopDto> mapCopDtoToList(final List<Cop> copsList) {
        return copsList.stream()
                .map(c -> new CopDto(
                        c.getId(),
                        c.getName(),
                        c.getLastName(),
                        c.getLogin(),
                        c.getResultsList()))
                .collect(Collectors.toList());

    }

    public Results mapToResultsDto(final ResultsDto resultsDto) {
        return new Results(
                resultsDto.getId(),
                resultsDto.getCop_id(),
                resultsDto.getPlace_of_service(),
                resultsDto.getDate(),
                resultsDto.getTime(),
                resultsDto.getType_of_patrol(),
                resultsDto.getLegitimated(),
                resultsDto.getChecked_in_the_system(),
                resultsDto.getQuotations(),
                resultsDto.getInterventions(),
                resultsDto.getNotations(),
                resultsDto.getMandates(),
                resultsDto.getVehicle_controls(),
                resultsDto.getArrested(),
                resultsDto.getKilometers_traveled());

    }

    public ResultsDto mapToResults(final Results results) {
        return new ResultsDto(
                results.getId(),
                results.getCop_id(),
                results.getPlace_of_service(),
                results.getDate(),
                results.getTime(),
                results.getType_of_patrol(),
                results.getLegitimated(),
                results.getChecked_in_the_system(),
                results.getQuotations(),
                results.getInterventions(),
                results.getNotations(),
                results.getMandates(),
                results.getVehicle_controls(),
                results.getArrested(),
                results.getKilometers_traveled());

    }
}