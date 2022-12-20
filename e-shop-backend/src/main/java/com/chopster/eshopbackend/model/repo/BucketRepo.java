package com.chopster.eshopbackend.model.repo;

import com.chopster.eshopbackend.model.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BucketRepo extends JpaRepository<Bucket, Long> {
    void deleteBucketById(Long id);

    Optional<Bucket> findBucketById(Long id);
}
