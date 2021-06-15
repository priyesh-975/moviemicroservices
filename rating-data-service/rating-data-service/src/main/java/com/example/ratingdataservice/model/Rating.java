package com.example.ratingdataservice.model;

public class Rating {
	
	private String movieId;
	
	private long ratings;
	
	public Rating() {
		
	}
	
	public Rating(String movieid,long rating) {
		this.movieId=movieid;
		this.ratings=rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public long getRatings() {
		return ratings;
	}

	public void setRatings(long ratings) {
		this.ratings = ratings;
	}
	
	

}
