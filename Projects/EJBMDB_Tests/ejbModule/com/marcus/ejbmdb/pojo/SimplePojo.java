package com.marcus.ejbmdb.pojo;

import java.io.Serializable;

public class SimplePojo implements Serializable {
	
    private int id;
    private String name;
    private String description;
    private double number;
    
    public SimplePojo(int id, String name, String description, double number ) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.number = number;
	}
    
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the number
	 */
	public double getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(double number) {
		this.number = number;
	}


}
