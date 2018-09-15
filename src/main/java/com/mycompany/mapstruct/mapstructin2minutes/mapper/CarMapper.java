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
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carEntityToCarDto(CarEntity carEntity);

    @Mapping(source = "seatCount", target = "numberOfSeats")
    CarEntity carDtoToCarEntity(CarDto carDto);
}
