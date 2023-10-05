package com.example.cafespring.Service.interfaces;

import com.example.cafespring.Entity.PositionEntity;
import com.example.cafespring.Repository.PositionRepository;
import com.example.cafespring.Service.IPositionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionService implements IPositionService {
    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
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
    public void deletePosition(Long id) {
        positionRepository.deleteById(id);
    }
}
