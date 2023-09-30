package com.example.cafespring.Service;

import com.example.cafespring.Entity.ClientEntity;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<ClientEntity> findAll();
    Optional<ClientEntity> findById(Long id);
    ClientEntity saveClient(ClientEntity clientEntity);
    ClientEntity updateClient(ClientEntity clientEntity);
    void deleteClient(Long id);
}
