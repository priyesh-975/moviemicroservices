package com.example.ratingdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratingdataservice.model.Rating;
import com.example.ratingdataservice.model.RatingList;

@RestController
public class RatingController 
{

	@GetMapping("/ratings/{movieId}")
	public Rating getRating(@PathVariable("movieId")String movieId)
	{
		return new Rating(movieId,2);
	}
	@GetMapping("users/{userId}")
	public RatingList getRatings(@PathVariable("userId") String userId )
	{
	   RatingList objRatingList = new RatingList();
	   List<Rating> ratingList=  Arrays.asList(
		new Rating("100",4),
		new Rating("102",5),
		new Rating("103",6),
		new Rating("104",7),
		new Rating("105",8),
		new Rating("106",9));
	    objRatingList.setRatings(ratingList);
	    return objRatingList;
	}
}


