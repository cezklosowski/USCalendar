package com.cezklosowski.mappers;

import com.cezklosowski.dtos.ProbeDTO;
import com.cezklosowski.entities.ProbeEntity;

public class ProbeMapper {

    public static ProbeDTO toDTO(ProbeEntity entity) {
        final ProbeDTO dto = new ProbeDTO();

        dto.setProbeId(entity.getProbeId());
        dto.setSerialNumber(entity.getSerialNumber());
        dto.setModelName(entity.getModelName());
        dto.setManufacturerName(entity.getManufacturerName());
        dto.setProductionDate(entity.getProductionDate());
        dto.setMinFrequency(entity.getMinFrequency());
        dto.setMaxFrequency(entity.getMaxFrequency());
        dto.setNumberOfElements(entity.getNumberOfElements());
        dto.setType(entity.getType());
        dto.setMatchingUltrasoundMachines(entity.getMatchingUltrasoundMachines());

        return dto;
    }

    public static ProbeEntity toEntity(ProbeDTO dto) {
        final ProbeEntity entity = new ProbeEntity();

        entity.setProbeId(dto.getProbeId());
        entity.setSerialNumber(dto.getSerialNumber());
        entity.setModelName(dto.getModelName());
        entity.setManufacturerName(dto.getManufacturerName());
        entity.setProductionDate(dto.getProductionDate());
        entity.setMinFrequency(dto.getMinFrequency());
        entity.setMaxFrequency(dto.getMaxFrequency());
        entity.setNumberOfElements(dto.getNumberOfElements());
        entity.setType(dto.getType());
        entity.setMatchingUltrasoundMachines(dto.getMatchingUltrasoundMachines());

        return entity;
    }

}
