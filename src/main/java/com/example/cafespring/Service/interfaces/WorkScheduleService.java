package com.example.cafespring.Service.interfaces;

import com.example.cafespring.Entity.WorkScheduleEntity;
import com.example.cafespring.Repository.WorkScheduleRepository;
import com.example.cafespring.Service.IWorkScheduleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkScheduleService implements IWorkScheduleService {
    private final WorkScheduleRepository workScheduleRepository;

    public WorkScheduleService(WorkScheduleRepository workScheduleRepository) {
        this.workScheduleRepository = workScheduleRepository;
    }

    @Override
    public List<WorkScheduleEntity> findAll() {
        return workScheduleRepository.findAll();
    }

    @Override
    public Optional<WorkScheduleEntity> findById(Long id) {
        return workScheduleRepository.findById(id);
    }

    @Override
    public WorkScheduleEntity findWorkScheduleByStaffId(Long id) {
        return workScheduleRepository.findWorkScheduleByStaffId(id);
    }

    @Override
    public List<WorkScheduleEntity> findWorkScheduleEntitiesByPositionBarista() {
        return workScheduleRepository.findWorkScheduleEntitiesByPositionBarista();
    }

    @Override
    public List<WorkScheduleEntity> findAllWorkSchedules() {
        return workScheduleRepository.findAllWorkSchedules();
    }

    @Override
    public WorkScheduleEntity saveWorkSchedule(WorkScheduleEntity workScheduleEntity) {
        return workScheduleRepository.save(workScheduleEntity);
    }

    @Override
    public WorkScheduleEntity updateWorkSchedule(WorkScheduleEntity workScheduleEntity) {
        return workScheduleRepository.save(workScheduleEntity);
    }

    @Override
    public void deleteWorkSchedule(Long id) {
        workScheduleRepository.deleteById(id);
    }
}
