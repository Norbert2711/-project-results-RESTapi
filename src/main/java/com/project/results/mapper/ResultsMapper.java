package com.project.results.mapper;

import com.project.results.domain.Results;
import com.project.results.domain.ResultsDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResultsMapper {

    public Results mapToResults(final ResultsDto resultsDto) {
        return new Results(
                resultsDto.getId(),
                resultsDto.getCop_id(),
                resultsDto.getDate(),
                resultsDto.getPlace_of_service(),
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
                resultsDto.getKilometers_traveled()
        );
    }

    public ResultsDto mapToResultsDto(final Results results) {
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
                results.getKilometers_traveled()
        );
    }

    public List<ResultsDto> mapResultsDtoList(final List<Results> resultsList) {
        return resultsList.stream()
                .map(r -> new ResultsDto(
                        r.getId(),
                        r.getCop_id(),
                        r.getPlace_of_service(),
                        r.getDate(),
                        r.getTime(),
                        r.getType_of_patrol(),
                        r.getLegitimated(),
                        r.getChecked_in_the_system(),
                        r.getQuotations(),
                        r.getInterventions(),
                        r.getNotations(),
                        r.getMandates(),
                        r.getVehicle_controls(),
                        r.getArrested(),
                        r.getKilometers_traveled()))
                .collect(Collectors.toList());

    }
}
