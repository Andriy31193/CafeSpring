package com.example.cafespring.Service;

import com.example.cafespring.Entity.ClientEntity;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IClientService {

    List<ClientEntity> findAll();
    Optional<ClientEntity> findById(Long id);
    ClientEntity findClientWithMinDiscount();
    ClientEntity findClientWithMaxDiscount();
    List<ClientEntity> findClientsWithMinDiscount();
    List<ClientEntity> findClientsWithMaxDiscount();
    ClientEntity findMinAgeClient();
    ClientEntity findMaxAgeClient();
    List<ClientEntity> findClientsWithNullEmail();
    List<ClientEntity> findClientsByTodayDate();
    double findAverageDiscount();
    ClientEntity saveClient(ClientEntity clientEntity);
    ClientEntity updateClient(ClientEntity clientEntity);
    void deleteClient(Long id);
}
