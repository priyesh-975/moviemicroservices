package com.example.moviecatalogservice.model;

public class Catalog {
	
	private String movieName;
	private String desc;
	private long rating;
	
	
	public Catalog() {
		
	}
	
	public Catalog(String movieName, String desc, long rating) {
		super();
		this.movieName = movieName;
		this.desc = desc;
		this.rating = rating;
	}

	public String getMovieName() {
		return movieName;
		
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public long getRating() {
		return rating;
	}
	public void setRating(long rating) {
		this.rating = rating;
	}
	

}
