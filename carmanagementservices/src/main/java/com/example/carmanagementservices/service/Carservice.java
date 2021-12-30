package com.example.carmanagementservices.service;


import java.util.List;
import java.util.Optional;

public interface Carservice {
	
	public String Register(int car_no);

	public String deleteCar(int car_no);
    public String modifycar(int car_no);
    public String display();


}
