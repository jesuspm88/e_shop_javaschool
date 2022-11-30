package com.chopster.eshopbackend.model.repo;

import com.chopster.eshopbackend.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface StatusRepo extends JpaRepository<Status, Long> {
    void deleteStatusById(Long id);

    Optional<Status> findStatusById(Long id);
}
