package com.example.cafespring.Repository;

import com.example.cafespring.Entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    @Query("SELECT c FROM ClientEntity c WHERE c.discount = (SELECT MIN(c2.discount) FROM ClientEntity c2)")
    ClientEntity findClientWithMinDiscount();

    @Query("SELECT c FROM ClientEntity c WHERE c.discount = (SELECT MAX(c2.discount) FROM ClientEntity c2)")
    ClientEntity findClientWithMaxDiscount();

    @Query("SELECT c FROM ClientEntity c WHERE c.discount = (SELECT MIN(c2.discount) FROM ClientEntity c2)")
    List<ClientEntity> findClientsWithMinDiscount();

    @Query("SELECT c FROM ClientEntity c WHERE c.discount = (SELECT MAX(c2.discount) FROM ClientEntity c2)")
    List<ClientEntity> findClientsWithMaxDiscount();

    @Query("SELECT AVG(c.discount) FROM ClientEntity c")
    double findAverageDiscount();

    @Query("SELECT c FROM ClientEntity c WHERE c.birthDate = (SELECT MAX(c2.birthDate) FROM ClientEntity c2)")
    ClientEntity findMinAgeClient();

    @Query("SELECT c FROM ClientEntity c WHERE c.birthDate = (SELECT MIN(c2.birthDate) FROM ClientEntity c2)")
    ClientEntity findMaxAgeClient();

    @Query("SELECT c FROM ClientEntity c WHERE c.email IS NULL")
    List<ClientEntity> findClientsWithNullEmail();

    @Query("SELECT o FROM OrderEntity o WHERE o.date = CURRENT_DATE()")
    List<ClientEntity> findOrdersByTodayDate();
}
