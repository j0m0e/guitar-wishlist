package com.guitar.model;

public class Guitar {
	Long id;
	String maker;
	String model;
	Integer year;
	String photoURL;
	String description;
	
	public Guitar() {}
	
	public Guitar(Long id, String maker, String model, Integer year,String photoURL, String description) {
		this.id = id;
		this.maker = maker;
		this.model = model;
		this.year = year;
		this.photoURL = photoURL;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}


