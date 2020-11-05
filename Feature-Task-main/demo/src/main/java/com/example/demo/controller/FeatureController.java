package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.demo.model.Feature;
import com.example.demo.service.FeatureService;

@RestController
@CrossOrigin(origins = "*") // To relax the same origin policy.
@RequestMapping("/api/")
public class FeatureController {

    @Autowired
    private FeatureService featureService;
    
    public FeatureController(FeatureService featureService) {
    	this.featureService = featureService;
	}
    
    // This request will create a htnew feature.
    @PostMapping(path = "/feature/create")
    public Feature postEnrollee(@RequestBody Feature feature) {
    	featureService.addToRepo(feature);
        return feature;
    }
    
    @GetMapping("/get/allfeatures")
    public List<Feature> getAll()
    {
    	return featureService.getAll();
    }

}
