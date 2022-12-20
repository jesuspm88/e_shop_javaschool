package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.BucketNotFoundException;
import com.chopster.eshopbackend.model.Bucket;
import com.chopster.eshopbackend.model.repo.BucketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BucketService {
    @Autowired
    private BucketRepo bucketRepo;

    public BucketService(BucketRepo bucketRepo) {
        this.bucketRepo = bucketRepo;
    }

    public Bucket addBucket(Bucket bucket){
        return bucketRepo.save(bucket);
    }

    public List<Bucket> findAllBuckets() {
        return bucketRepo.findAll();
    }

    public Bucket updateBucket(Bucket bucket){
        return bucketRepo.save(bucket);
    }

    public Bucket findBucketById(Long id){
        return bucketRepo.findBucketById(id).orElseThrow(() -> new BucketNotFoundException("Bucket by id " + id + " was not found."));
    }

    public void deleteBucket(Long id){
        bucketRepo.deleteBucketById(id);
    }
}
