package com.cezklosowski.mappers;

import com.cezklosowski.dtos.LoanDTO;
import com.cezklosowski.entities.LoanEntity;

public class LoanMapper {

    public static LoanDTO toDTO(LoanEntity entity) {
        final LoanDTO dto = new LoanDTO();

        dto.setLoanId(entity.getLoanId());
        dto.setPlaceName(entity.getPlaceName());
        dto.setStartTime(entity.getStartTime());
        dto.setEndTime(entity.getEndTime());
        dto.setUltrasoundMachines(entity.getUltrasoundMachines());

        return dto;
    }

    public static LoanEntity toEntity(LoanDTO dto) {
        final LoanEntity entity = new LoanEntity();

        entity.setLoanId(dto.getLoanId());
        entity.setPlaceName(dto.getPlaceName());
        entity.setStartTime(dto.getStartTime());
        entity.setEndTime(dto.getEndTime());
        entity.setUltrasoundMachines(dto.getUltrasoundMachines());

        return entity;
    }
}
