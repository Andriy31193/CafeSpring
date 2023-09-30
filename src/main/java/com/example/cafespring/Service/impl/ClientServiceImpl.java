package com.example.cafespring.Service.impl;

import com.example.cafespring.Entity.ClientEntity;
import com.example.cafespring.Repository.ClientRepository;
import com.example.cafespring.Service.ClientService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public List<ClientEntity> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<ClientEntity> findById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public ClientEntity findClientWithMinDiscount() {
        return clientRepository.findClientWithMinDiscount();
    }

    @Override
    public ClientEntity findClientWithMaxDiscount() {
        return clientRepository.findClientWithMaxDiscount();
    }

    @Override
    public List<ClientEntity> findClientsWithMinDiscount() {
        return clientRepository.findClientsWithMinDiscount();
    }

    @Override
    public List<ClientEntity> findClientsWithMaxDiscount() {
        return clientRepository.findClientsWithMaxDiscount();
    }

    @Override
    public ClientEntity findMinAgeClient() {
        return clientRepository.findMinAgeClient();
    }

    @Override
    public ClientEntity findMaxAgeClient() {
        return clientRepository.findMaxAgeClient();
    }

    @Override
    public List<ClientEntity> findClientsWithNullEmail() {
        return clientRepository.findClientsWithNullEmail();
    }

    @Override
    public List<ClientEntity> findClientsByTodayDate() {
        return clientRepository.findOrdersByTodayDate();
    }

    @Override
    public double findAverageDiscount() {
        return clientRepository.findAverageDiscount();
    }


    @Override
    public ClientEntity saveClient(ClientEntity clientEntity) {
        return clientRepository.save(clientEntity);
    }

    @Override
    public ClientEntity updateClient(ClientEntity clientEntity) {
        return clientRepository.save(clientEntity);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
