package com.api.cellphonecontrol.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_SPECIFICATIONS")
public class SpecificationsModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 50)
    private String ram;
    @Column(nullable = false, length = 50)
    private String rom;
    @Column(nullable = false, length = 50)
    private String screen;
    @Column(length = 50)
    private String batteryHealth;

}
