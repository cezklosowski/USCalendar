package com.cezklosowski.services;

import com.cezklosowski.dtos.LoanDTO;
import com.cezklosowski.dtos.UltrasoundMachineDTO;
import com.cezklosowski.entities.LoanEntity;
import com.cezklosowski.entities.UltrasoundMachineEntity;
import com.cezklosowski.mappers.LoanMapper;
import com.cezklosowski.mappers.UltrasoundMachineMapper;
import com.cezklosowski.repositories.LoanRepository;
import com.cezklosowski.repositories.UltrasoundMachineRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class UltrasoundMachineService {
    private final UltrasoundMachineRepository ultrasoundMachineRepository;

    public List<UltrasoundMachineDTO> getAllUltrasoundMachines() {
        final List<UltrasoundMachineEntity> allEntities = ultrasoundMachineRepository.findAll();

        final List<UltrasoundMachineDTO> dtosList = allEntities.stream()
                .map(entity -> UltrasoundMachineMapper.toDTO(entity))
                .collect(Collectors.toList());

        return dtosList;
    }

    public void addNewUltrasoundMachine(UltrasoundMachineDTO dto) {
        final UltrasoundMachineEntity entity = UltrasoundMachineMapper.toEntity(dto);
        ultrasoundMachineRepository.save(entity);
    }

}
