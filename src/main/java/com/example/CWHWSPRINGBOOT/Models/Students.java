package com.example.CWHWSPRINGBOOT.Models;

public class Students {
	private int id;
    private String name;
    private float mark;
    
    public Students(int id,String name,float mark) {
    	this.id=id;
    	this.name=name;
    	this.mark=mark;
    }
    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id=id;
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public float getMark() {
    	return mark;
    }
    public void getMark(float price) {
    	this.mark=mark;
    }
}
