package com.api.cellphonecontrol.controller;

import com.api.cellphonecontrol.dto.CellPhoneDto;
import com.api.cellphonecontrol.model.CellPhoneModel;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.api.cellphonecontrol.service.CellPhoneService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/cellphone-control")
public class CellPhoneController {

    final CellPhoneService cellPhoneService;

    @Autowired
    public CellPhoneController(CellPhoneService cellPhoneService) {
        this.cellPhoneService = cellPhoneService;
    }

    @PostMapping
    public ResponseEntity<CellPhoneModel> saveCellphone (@RequestBody @Valid CellPhoneDto cellPhoneDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(cellPhoneService.save(cellPhoneDto));
    }

}
