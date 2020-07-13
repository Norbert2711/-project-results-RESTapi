package com.project.results.mapper;

import com.project.results.domain.Results;
import com.project.results.domain.ResultsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResultsMapper {

    @Autowired
    private CopMapper copMapper;

    public Results mapToResults(final ResultsDto resultsDto) {
        return new Results(
                resultsDto.getId(),
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
                resultsDto.getKilometers_traveled(),
                resultsDto.getRest_day(),
                resultsDto.getHoliday(),
                resultsDto.getSick_leave()

        );
    }

    public ResultsDto mapToResultsDto(final Results results) {
        return new ResultsDto(
                results.getId(),
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
                results.getKilometers_traveled(),
                results.getRest_day(),
                results.getHoliday(),
                results.getSick_leave()

        );
//        resultsDto.setCopDto(copMapper.mapToCopDto(results.getCop()));
//        return resultsDto;
    }

    public List<ResultsDto> mapResultsDtoList(final List<Results> resultsList) {
        return resultsList.stream()
                .map(this::mapToResultsDto)
                .collect(Collectors.toList());
    }
}