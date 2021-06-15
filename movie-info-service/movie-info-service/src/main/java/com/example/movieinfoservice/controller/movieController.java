package com.example.movieinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class movieController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${api.key}")
	private String apikey;
	
	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
		
	Movie movie=this.restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apikey+"",Movie.class);
	
		
		return movie;
		
	}
	
	

}
