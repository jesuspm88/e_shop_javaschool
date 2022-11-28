package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.StatusNotFoundException;
import com.chopster.eshopbackend.model.Status;
import com.chopster.eshopbackend.repo.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {
    private final StatusRepo statusRepo;

    @Autowired
    public StatusService(StatusRepo statusRepo) {
        this.statusRepo = statusRepo;
    }

    public Status addStatus(Status status){
        return statusRepo.save(status);
    }

    public List<Status> findAllStatuses() {
        return statusRepo.findAll();
    }

    public Status updateStatus(Status status){
        return statusRepo.save(status);
    }

    public Status findStatusById(Integer id){
        return statusRepo.findStatusById(id).orElseThrow(() -> new StatusNotFoundException("Status by id " + id + " was not found."));
    }

    public void deleteStatus(Integer id){
        statusRepo.deleteStatusById(id);
    }
}
