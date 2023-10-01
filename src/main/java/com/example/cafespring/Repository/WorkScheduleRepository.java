package com.example.cafespring.Repository;

import com.example.cafespring.Entity.WorkScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkScheduleRepository extends JpaRepository<WorkScheduleEntity, Long> {
    @Query("SELECT w FROM WorkScheduleEntity w WHERE w.staff.id = :id")
    WorkScheduleEntity findWorkScheduleByStaffId(@Param("id") Long staffId);

    @Query("SELECT w FROM WorkScheduleEntity w WHERE w.staff.position.id = 2")
    List<WorkScheduleEntity> findWorkScheduleEntitiesByPositionBarista();

    @Query("SELECT w FROM WorkScheduleEntity w")
    List<WorkScheduleEntity> findAllWorkSchedules();


}
