package com.example.cafespring.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "client")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "dicount")
    private Double discount;

    @Column(name = "bithdate")
    private Date birthDate;

    public ClientEntity() {
    }
}
