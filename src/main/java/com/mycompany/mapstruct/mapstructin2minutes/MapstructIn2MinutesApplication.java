package com.mycompany.mapstruct.mapstructin2minutes;

import com.mycompany.mapstruct.mapstructin2minutes.domain.entity.CarEntity;
import com.mycompany.mapstruct.mapstructin2minutes.domain.enums.CarType;
import com.mycompany.mapstruct.mapstructin2minutes.dto.CarDto;
import com.mycompany.mapstruct.mapstructin2minutes.mapper.CarMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MapstructIn2MinutesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        log.info("STARTING THE APPLICATION");
        SpringApplication.run(MapstructIn2MinutesApplication.class, args);
        log.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("EXECUTING: command line runner");

        CarEntity car = new CarEntity("Ford", 5, CarType.STOCK_CAR);

        CarDto carDto = CarMapper.INSTANCE.carEntityToCarDto(car);

        log.info(carDto.toString());

    }
}
