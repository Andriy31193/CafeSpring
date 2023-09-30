package com.example.cafespring.Service;

import com.example.cafespring.Entity.PositionEntity;
import com.example.cafespring.Entity.StaffEntity;

import java.util.List;
import java.util.Optional;

public interface PositionService {

    List<PositionEntity> findAll();
    Optional<PositionEntity> findById(Long id);
    PositionEntity savePosition(PositionEntity positionEntity);
    PositionEntity updatePosition(PositionEntity positionEntity);
    void deletePosition(Long id);
}
