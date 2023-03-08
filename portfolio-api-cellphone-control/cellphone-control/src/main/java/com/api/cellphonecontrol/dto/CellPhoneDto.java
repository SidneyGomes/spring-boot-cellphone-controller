package com.api.cellphonecontrol.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CellPhoneDto {

    @NotBlank(message = "The value must be contain a string ")
    private String name;
    @NotBlank(message = "The value must be contain a string ")
    private String hallmark;
    @NotBlank(message = "The value must be contain a string ")
    private String model;
    @Min(value = 0, message = "The value must be positive")
    private float price;
    @NotNull
    SpecificationsDto specifications; // The name of variable equals of Model class.

}
