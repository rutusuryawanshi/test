package com.example.carmanagementservices.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class CarServiceImpl implements carservice {

	
	@Autowired
	RestTemplate restTemplate;
	
	
	
	
	@Override
	public String deleteCar(int car_no) {
		// TODO Auto-generated method stub
		carDao.deleteBycar_no(car_no);
		return "CarDeleted";
}
