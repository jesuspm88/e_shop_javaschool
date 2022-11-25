package com.chopster.eshopbackend.repo;

import com.chopster.eshopbackend.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepo extends JpaRepository<Address, Integer> {
    void deleteAddressById(Integer id);

    Optional<Address> findAddressById(Integer id);
}
