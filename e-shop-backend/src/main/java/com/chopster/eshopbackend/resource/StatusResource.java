package com.chopster.eshopbackend.resource;

import com.chopster.eshopbackend.model.Status;
import com.chopster.eshopbackend.service.StatusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusResource {
    private final StatusService statusService;

    public StatusResource(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Status>> getAllStatuses(){
        List<Status> statuses = statusService.findAllStatuses();
        return new ResponseEntity<>(statuses, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Status> getStatusById(@PathVariable("id") Integer id){
        Status status = statusService.findStatusById(id);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Status> addStatus(@RequestBody Status status){
        Status newStatus = statusService.addStatus(status);
        return new ResponseEntity<>(newStatus, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Status> updateStatus(@RequestBody Status status){
        Status updateStatus = StatusService.updateStatus(status);
        return new ResponseEntity<>(updateStatus, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStatus(@PathVariable("id") Integer id){
        statusService.deleteStatus(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
