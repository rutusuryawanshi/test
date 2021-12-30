package com.example.carmanagementservices.model;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car")
public class Car {

	@Id
	int car_no;
	
	
	@Column
	String car_owner;
	
	@Column
	int fuel_type;
	
	@Column
	int no_of_seats;
	
	@Column
	String model;
	
	
	public Car() {
		
	}

	
	public Car(int car_no,String car_owner,int fuel_type,int no_of_seats,string model) {
		super();
		this.car_no = car_no;
		this.car_owner = car_owner;
		this.fuel_type = fuel_type;
		this.no_of_seats = no_of_seats;
		this.model = model;
	}

	public int getCar_no() {
		return car_no;
	}


	public void setCar_no(int car_no) {
		this.car_no = car_no;
	}


	public String getCar_owner() {
		return car_owner;
	}


	public void setCar_owner(String car_owner) {
		this.car_owner = car_owner;
	}


	public int getFuel_type() {
		return fuel_type;
	}


	public void setFuel_type(int fuel_type) {
		this.fuel_type = fuel_type;
	}


	public int getNo_of_seats() {
		return no_of_seats;
	}


	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	
}
