package com.chopster.eshopbackend.repo;

import com.chopster.eshopbackend.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepo extends CrudRepository<Address, Long> {
    void deleteAddressById(Long id);

    Optional<Address> findAddressById(Long id);
}
