package com.example.cafespring.Service;

import com.example.cafespring.Entity.ClientEntity;
import com.example.cafespring.Entity.StaffEntity;

import java.util.List;
import java.util.Optional;

public interface IStaffService {

    List<StaffEntity> findAll();
    Optional<StaffEntity> findById(Long id);
    StaffEntity saveStaff(StaffEntity staffEntity);
    StaffEntity updateStaff(StaffEntity staffEntity);
    void deleteStaff(Long id);
}
