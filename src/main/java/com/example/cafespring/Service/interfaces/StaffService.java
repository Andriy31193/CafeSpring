package com.example.cafespring.Service.interfaces;

import com.example.cafespring.Entity.StaffEntity;
import com.example.cafespring.Repository.StaffRepository;
import com.example.cafespring.Service.IStaffService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService implements IStaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }


    @Override
    public List<StaffEntity> findAll() {
        return staffRepository.findAll();
    }

    @Override
    public Optional<StaffEntity> findById(Long id) {
        return staffRepository.findById(id);
    }


    @Override
    public StaffEntity saveStaff(StaffEntity staffEntity) {
        return staffRepository.save(staffEntity);
    }

    @Override
    public StaffEntity updateStaff(StaffEntity staffEntity) {
        return staffRepository.save(staffEntity);
    }

    @Override
    public void deleteStaff(Long id) {
        staffRepository.deleteById(id);
    }
}
