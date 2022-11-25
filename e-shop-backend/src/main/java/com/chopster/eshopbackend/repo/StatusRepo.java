package com.chopster.eshopbackend.repo;

import com.chopster.eshopbackend.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StatusRepo extends JpaRepository<Status, Integer> {
    void deleteStatusById(Integer id);

    Optional<Status> findStatusById(Integer id);
}
