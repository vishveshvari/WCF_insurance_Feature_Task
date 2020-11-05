package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Feature;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, String> {


}
