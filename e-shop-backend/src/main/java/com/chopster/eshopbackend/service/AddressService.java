package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.AddressNotFoundException;
import com.chopster.eshopbackend.model.Address;
import com.chopster.eshopbackend.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressService {
    private final AddressRepo addressRepo;

    @Autowired
    public AddressService(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    public Address addAddress(Address address){
        return addressRepo.save(address);
    }

    public List<Address> findAllAddresses() {
        return addressRepo.findAll();
    }

    public Address updateAddress(Address address){
        return addressRepo.save(address);
    }

    public Address findAddressById(Integer id){
        return addressRepo.findAddressById(id).orElseThrow(() -> new AddressNotFoundException("Address by id " + id + " was not found."));
    }

    public void deleteAddress(Integer id){
        addressRepo.deleteAddressById(id);
    }
}
