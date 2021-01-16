package com.cezklosowski.services;

import com.cezklosowski.dtos.ProbeDTO;
import com.cezklosowski.dtos.UltrasoundMachineDTO;
import com.cezklosowski.entities.ProbeEntity;
import com.cezklosowski.entities.UltrasoundMachineEntity;
import com.cezklosowski.mappers.ProbeMapper;
import com.cezklosowski.mappers.UltrasoundMachineMapper;
import com.cezklosowski.repositories.ProbeRepository;
import com.cezklosowski.repositories.UltrasoundMachineRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProbeService {
    private final ProbeRepository probeRepository;

    public List<ProbeDTO> getAllProbes() {
        final List<ProbeEntity> allEntities = probeRepository.findAll();

        final List<ProbeDTO> dtosList = allEntities.stream()
                .map(entity -> ProbeMapper.toDTO(entity))
                .collect(Collectors.toList());

        return dtosList;
    }

    public void addNewProbe(ProbeDTO dto) {
        final ProbeEntity entity = ProbeMapper.toEntity(dto);
        probeRepository.save(entity);
    }


}
