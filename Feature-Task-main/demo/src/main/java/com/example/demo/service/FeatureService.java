package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import com.example.demo.model.Feature;
import com.example.demo.repository.FeatureRepository;

@Service
public class FeatureService {
	
	@Autowired
	FeatureRepository featureRepository;
	
	public Feature addToRepo(Feature feature)
	{
		return featureRepository.save(feature);
	}

	public List<Feature> getAll() {
		return featureRepository.findAll();
	}

}
