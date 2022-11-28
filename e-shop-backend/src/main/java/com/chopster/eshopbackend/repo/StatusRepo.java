package com.chopster.eshopbackend.repo;

import com.chopster.eshopbackend.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StatusRepo extends JpaRepository<Status, Long> {
    void deleteStatusById(Long id);

    Optional<Status> findStatusById(Long id);
}
