/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.mapstruct.mapstructin2minutes.mapper;

import com.mycompany.mapstruct.mapstructin2minutes.domain.entity.CarEntity;
import com.mycompany.mapstruct.mapstructin2minutes.dto.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CarMapper {

    @Mappings({
        @Mapping(source = "numberOfSeats", target = "seatCount"),
        @Mapping(source = "carType", target = "type")
    })
    CarDto carEntityToCarDto(CarEntity carEntity);

    @Mappings({
        @Mapping(source = "seatCount", target = "numberOfSeats"),
        @Mapping(source = "type", target = "carType")
    })
    CarEntity carDtoToCarEntity(CarDto carDto);
}
