package com.example.cafespring.Service.interfaces;

import com.example.cafespring.Entity.DishEntity;
import com.example.cafespring.Repository.DishRepository;
import com.example.cafespring.Service.IDishService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishService implements IDishService {
    private final DishRepository dishRepository;

    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Override
    public List<DishEntity> findAll() {
        return dishRepository.findAll();
    }

    @Override
    public Optional<DishEntity> findById(Long id) {
        return dishRepository.findById(id);
    }

    @Override
    public DishEntity saveDish(DishEntity dishEntity) {
        return dishRepository.save(dishEntity);
    }

    @Override
    public DishEntity updateDish(DishEntity dishEntity) {
        return dishRepository.save(dishEntity);
    }

    @Override
    public void deleteDish(Long id) {
        dishRepository.deleteById(id);
    }
}
