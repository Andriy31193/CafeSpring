package com.example.cafespring.Service;

import com.example.cafespring.Entity.StaffEntity;
import com.example.cafespring.Entity.WorkScheduleEntity;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface WorkScheduleService {
    List<WorkScheduleEntity> findAll();
    Optional<WorkScheduleEntity> findById(Long id);
    WorkScheduleEntity findWorkScheduleByStaffId(@Param("id")Long id);
    List<WorkScheduleEntity> findWorkScheduleEntitiesByPositionBarista();
    List<WorkScheduleEntity> findAllWorkSchedules();
    WorkScheduleEntity saveWorkSchedule(WorkScheduleEntity workScheduleEntity);
    WorkScheduleEntity updateWorkSchedule(WorkScheduleEntity workScheduleEntity);
    void deleteWorkSchedule(Long id);
}
