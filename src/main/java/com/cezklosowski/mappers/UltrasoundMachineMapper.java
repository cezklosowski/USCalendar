package com.cezklosowski.mappers;

import com.cezklosowski.dtos.LoanDTO;
import com.cezklosowski.dtos.UltrasoundMachineDTO;
import com.cezklosowski.entities.LoanEntity;
import com.cezklosowski.entities.UltrasoundMachineEntity;

public class UltrasoundMachineMapper {
    public static UltrasoundMachineDTO toDTO(UltrasoundMachineEntity entity) {
        final UltrasoundMachineDTO dto = new UltrasoundMachineDTO();

        dto.setUltrasoundMachineId(entity.getUltrasoundMachineId());
        dto.setSerialNumber(entity.getSerialNumber());
        dto.setModelName(entity.getModelName());
        dto.setManufacturerName(entity.getManufacturerName());
        dto.setProductionDate(entity.getProductionDate());

        return dto;
    }
}
