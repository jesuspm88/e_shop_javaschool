package com.chopster.eshopbackend.resource;

import com.chopster.eshopbackend.model.Bucket;
import com.chopster.eshopbackend.service.BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bucket")
public class BucketResource {
    @Autowired
    private BucketService bucketService;

    public BucketResource(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Bucket>> getAllBuckets(){
        List<Bucket> buckets = bucketService.findAllBuckets();
        return new ResponseEntity<>(buckets, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Bucket> getBucketById(@PathVariable("id") Long id){
        Bucket bucket = bucketService.findBucketById(id);
        return new ResponseEntity<>(bucket, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Bucket> addBucket(@RequestBody Bucket bucket){
        Bucket newBucket = bucketService.addBucket(bucket);
        return new ResponseEntity<>(newBucket, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Bucket> updateBucket(@RequestBody Bucket bucket){
        Bucket updateBucket = bucketService.updateBucket(bucket);
        return new ResponseEntity<>(updateBucket, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBucket(@PathVariable("id") Long id){
        bucketService.deleteBucket(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
