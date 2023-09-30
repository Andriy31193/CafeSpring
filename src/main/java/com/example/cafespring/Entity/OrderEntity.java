package com.example.cafespring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany
    private List<DishEntity>  dishes;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;

    private Date date;

    public OrderEntity() {

    }


}
