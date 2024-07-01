package com.example.nexa.repository;

import com.example.nexa.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query(value = "SELECT * FROM client WHERE email = ?1 AND password = ?2", nativeQuery = true)
    Client getClientByClientEmailAndPassword(String email, String password);
    Client findByEmail(String email);
    boolean existsByEmail(String email);

}
