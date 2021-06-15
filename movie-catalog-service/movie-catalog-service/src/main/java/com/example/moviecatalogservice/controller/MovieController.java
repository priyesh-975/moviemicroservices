package com.example.moviecatalogservice.controller;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.moviecatalogservice.model.Catalog;
import com.example.moviecatalogservice.model.Movie;
import com.example.moviecatalogservice.model.Rating;
import com.example.moviecatalogservice.model.RatingList;

@RestController
@RequestMapping("/resource")
public class MovieController {

	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@GetMapping("/{id}")
	public List<Catalog> getmovieList(@PathVariable("id") String id)
	{
		
		
		RatingList r= restTemplate.getForObject("http://rating-data-service/users/"+id, RatingList.class);	
		return r.getRatings().stream().map(rating ->
		{
			Movie movie=restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(),Movie.class);
			return new Catalog(movie.getOriginal_title(),movie.getOverview(),rating.getRatings());
			
			
			
		}).collect(Collectors.toList());
		
		
		
	}
	

}
