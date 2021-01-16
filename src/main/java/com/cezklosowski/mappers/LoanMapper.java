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
}
