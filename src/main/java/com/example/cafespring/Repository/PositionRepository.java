package com.example.cafespring.Repository;

import com.example.cafespring.Entity.ClientEntity;
import com.example.cafespring.Entity.PositionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<PositionEntity, Long> {
}