package com.example.cafespring.Service.impl;

import com.example.cafespring.Entity.ClientEntity;
import com.example.cafespring.Entity.PositionEntity;
import com.example.cafespring.Entity.StaffEntity;
import com.example.cafespring.Repository.PositionRepository;
import com.example.cafespring.Repository.StaffRepository;
import com.example.cafespring.Service.PositionService;
import com.example.cafespring.Service.StaffService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionServiceImpl implements PositionService {
    private final PositionRepository positionRepository;

    public PositionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }


    @Override
    public List<PositionEntity> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public Optional<PositionEntity> findById(Long id) {
        return positionRepository.findById(id);
    }


    @Override
    public PositionEntity savePosition(PositionEntity positionEntity) {
        return positionRepository.save(positionEntity);
    }

    @Override
    public PositionEntity updatePosition(PositionEntity positionEntity) {
        return positionRepository.save(positionEntity);
    }

    @Override
    public void deleteStaff(Long id) {
        positionRepository.deleteById(id);
    }
}
