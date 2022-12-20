package com.chopster.eshopbackend.model.repo;

import com.chopster.eshopbackend.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepo extends JpaRepository<Client, Long> {
    void deleteClientById(Long id);

    Optional<Client> findClientById(Long id);
}
