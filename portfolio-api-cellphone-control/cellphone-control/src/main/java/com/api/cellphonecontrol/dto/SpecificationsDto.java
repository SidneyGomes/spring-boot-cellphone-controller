package com.api.cellphonecontrol.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpecificationsDto {
    @NotBlank(message = "The value must be contain a string ")
    private String ram;
    @NotBlank(message = "The value must be contain a string ")
    private String rom;
    @NotBlank(message = "The value must be contain a string ")
    private String screen;
    private String batteryHealth;
}
