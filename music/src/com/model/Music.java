package com.model;

public class Music {
	
	private String id;
	private String name;
	@SuppressWarnings("unused")
	private String author;
	private String path;
	@SuppressWarnings("unused")
	private String length;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	
	

}
