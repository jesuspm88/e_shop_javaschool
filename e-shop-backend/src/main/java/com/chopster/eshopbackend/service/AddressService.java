package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.AddressNotFoundException;
import com.chopster.eshopbackend.model.Address;
import com.chopster.eshopbackend.model.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;

    public AddressService(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    public Address addAddress(Address address){
        return addressRepo.save(address);
    }

    public List<Address> findAllAddresses() {
        return (List<Address>) addressRepo.findAll();
    }

    public Address updateAddress(Address address){
        return addressRepo.save(address);
    }

    public Address findAddressById(Long id){
        return addressRepo.findAddressById(id).orElseThrow(() -> new AddressNotFoundException("Address by id " + id + " was not found."));
    }

    public void deleteAddress(Long id){
        addressRepo.deleteAddressById(id);
    }
}
