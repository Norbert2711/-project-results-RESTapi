package com.project.results.mapper;


import com.project.results.domain.Pluton;
import com.project.results.domain.PlutonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlutonMapper {

    @Autowired
    private CommanderMapper commanderMapper;
    @Autowired
    private CopMapper copMapper;
    @Autowired
    private ResultsMapper resultsMapper;

    public Pluton mapToPluton(PlutonDto plutonDto) {
        return new Pluton(
                plutonDto.getId(),
                plutonDto.getName()
        );
    }

    public PlutonDto mapToPlutonDto(Pluton pluton) {
        PlutonDto plutonDto = new PlutonDto(
                pluton.getId(),
                pluton.getName()
        );
        plutonDto.setCommanderDtoList(commanderMapper.mapCommanderDtoToList(pluton.getCommanderList()));
        return plutonDto;
    }

    public List<PlutonDto> mapToPlutonDtoList (List<Pluton> plutonList){
        return plutonList.stream()
                .map(this::mapToPlutonDto)
                .collect(Collectors.toList());
    }
}
