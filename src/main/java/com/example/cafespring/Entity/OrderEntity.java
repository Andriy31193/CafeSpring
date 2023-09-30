package com.example.cafespring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "order_dish", // Название таблицы-связи
            joinColumns = @JoinColumn(name = "order_id"), // Столбец, связывающий сущность OrderEntity
            inverseJoinColumns = @JoinColumn(name = "dish_id") // Столбец, связывающий сущность DishEntity
    )
    private List<DishEntity>  dishes;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;

    private Date date;

    public OrderEntity() {

    }


}
