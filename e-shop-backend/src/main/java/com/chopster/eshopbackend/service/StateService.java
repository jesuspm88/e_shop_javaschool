package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.StateNotFoundException;
import com.chopster.eshopbackend.model.State;
import com.chopster.eshopbackend.model.repo.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {
    @Autowired
    private StateRepo stateRepo;

    public StateService(StateRepo stateRepo) {
        this.stateRepo = stateRepo;
    }

    public State addState(State state){
        return stateRepo.save(state);
    }

    public List<State> findAllStates() {
        return stateRepo.findAll();
    }

    public State updateState(State state){
        return stateRepo.save(state);
    }

    public State findStateById(Long id){
        return stateRepo.findStateById(id).orElseThrow(() -> new StateNotFoundException("State by id " + id + " was not found."));
    }

    public void deleteState(Long id){
        stateRepo.deleteStateById(id);
    }
}
