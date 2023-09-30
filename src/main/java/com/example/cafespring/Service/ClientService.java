package com.example.cafespring.Service;

import com.example.cafespring.Entity.ClientEntity;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<ClientEntity> findAll();
    Optional<ClientEntity> findById(Long id);
    ClientEntity findClientWithMinDiscount();
    ClientEntity findClientWithMaxDiscount();
    List<ClientEntity> findClientsWithMinDiscount();
    List<ClientEntity> findClientsWithMaxDiscount();
    ClientEntity findMinAgeClient();
    ClientEntity findMaxAgeClient();
    double getAverageDiscount();
    ClientEntity saveClient(ClientEntity clientEntity);
    ClientEntity updateClient(ClientEntity clientEntity);
    void deleteClient(Long id);
}
