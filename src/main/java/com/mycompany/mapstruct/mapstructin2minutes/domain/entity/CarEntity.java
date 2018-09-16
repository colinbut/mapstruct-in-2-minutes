/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.mapstruct.mapstructin2minutes.domain.entity;

import com.mycompany.mapstruct.mapstructin2minutes.domain.enums.CarType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarEntity {
    private String make;
    private int numberOfSeats;
    private CarType carType;
}
