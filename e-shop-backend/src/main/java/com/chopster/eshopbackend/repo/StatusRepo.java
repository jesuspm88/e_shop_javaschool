package com.chopster.eshopbackend.repo;

import com.chopster.eshopbackend.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StatusRepo extends JpaRepository<Status, Long> {
    void deleteStatusById(Long id);

    Optional<Status> findStatusById(Long id);
}
