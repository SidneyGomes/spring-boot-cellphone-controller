package com.api.cellphonecontrol.repository;

import com.api.cellphonecontrol.model.CellPhoneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CellPhoneRepository extends JpaRepository<CellPhoneModel, UUID> {
}
