package com.example.cafespring.Service;

import com.example.cafespring.Entity.DishEntity;
import com.example.cafespring.Entity.PositionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IDishService {

    List<DishEntity> findAll();

    Optional<DishEntity> findById(Long id);

    DishEntity saveDish(DishEntity dishEntity);

    DishEntity updateDish(DishEntity dishEntity);

    void deleteDish(Long id);
}
