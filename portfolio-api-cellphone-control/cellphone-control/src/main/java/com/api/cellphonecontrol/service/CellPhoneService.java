package com.api.cellphonecontrol.service;

import com.api.cellphonecontrol.dto.CellPhoneDto;
import com.api.cellphonecontrol.model.CellPhoneModel;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.cellphonecontrol.repository.CellPhoneRepository;

@Service
public class CellPhoneService {
    final CellPhoneRepository cellPhoneRepository;
    final ModelMapper modelMapper;

    @Autowired
    public CellPhoneService(CellPhoneRepository cellPhoneRepository, ModelMapper modelMapper) {
        this.cellPhoneRepository = cellPhoneRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public CellPhoneModel save(CellPhoneDto cellPhoneDto) {
        var cellPhoneModel = new CellPhoneModel();
        modelMapper.map(cellPhoneDto, cellPhoneModel);

        return cellPhoneRepository.save(cellPhoneModel);
    }
}
