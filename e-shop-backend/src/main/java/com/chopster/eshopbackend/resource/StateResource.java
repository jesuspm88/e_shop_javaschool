package com.chopster.eshopbackend.resource;

import com.chopster.eshopbackend.model.State;
import com.chopster.eshopbackend.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateResource {
    @Autowired
    private StateService stateService;

    public StateResource(StateService stateService) {
        this.stateService = stateService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<State>> getAllStates(){
        List<State> states = stateService.findAllStates();
        return new ResponseEntity<>(states, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<State> getStateById(@PathVariable("id") Long id){
        State state = stateService.findStateById(id);
        return new ResponseEntity<>(state, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<State> addState(@RequestBody State state){
        State newState = stateService.addState(state);
        return new ResponseEntity<>(newState, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<State> updateState(@RequestBody State state){
        State updateState = stateService.updateState(state);
        return new ResponseEntity<>(updateState, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteState(@PathVariable("id") Long id){
        stateService.deleteState(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
