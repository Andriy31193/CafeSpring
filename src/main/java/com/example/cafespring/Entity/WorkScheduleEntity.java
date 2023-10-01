package com.example.cafespring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
public class WorkScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "starttime")
    private LocalDateTime startTime;

    @Column(name = "endtime")
    private LocalDateTime endTime;

    @ManyToOne
    @JoinColumn(name = "staff_id")

    private StaffEntity staff;
    public WorkScheduleEntity() {
    }
}
