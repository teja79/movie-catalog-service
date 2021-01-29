package com.ravi.moviecatalogservice.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.moviecatalogservice.model.CatalogItem;
import com.ravi.moviecatalogservice.model.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource{
	
	@RequestMapping("{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		
		List<Rating> ratings=Arrays.asList(new Rating("1234",4), new Rating("5678",3));
		
		ratings.stream().forEach(rating -> new CatalogItem("Transformers", "Test", 4)
		).collect(Collectors.toList());
		
		return ratings;
				
				
				
	}

}
