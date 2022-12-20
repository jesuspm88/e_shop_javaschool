package com.chopster.eshopbackend.model.repo;

import com.chopster.eshopbackend.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StateRepo extends JpaRepository<State, Long> {
    void deleteStateById(Long id);

    Optional<State> findStateById(Long id);
}
