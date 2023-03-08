package com.api.cellphonecontrol.model;

import com.api.cellphonecontrol.dto.SpecificationsDto;
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
@Table(name = "TB_CELlPHONE")
public class CellPhoneModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, length = 100)
    private String hallmark;
    @Column(nullable = false, length = 100)
    private String model;
    @Column(nullable = false)
    private float price;

     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "fk_specifications_id")
     private SpecificationsModel specifications;

}
