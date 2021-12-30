package com.example.carmanagementservices.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Car")
public class carcontroller {


	@Autowired
	CarService CarService;

	@GetMapping("/all")
	public ResponseEntity<List<Car>> getAll(){
		return new ResponseEntity(CarService.getAll(),HttpStatus.OK);
	}
	@PutMapping("/modify")
	public ResponseEntity<Car> modifyCar(@RequestBody car car){
		return new ResponseEntity(CarService.updateCar(Car), HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/delete/{car_no}")
	public ResponseEntity<String> deleteCar(int car_no){
		return new ResponseEntity(CarService.deleteCar(car_no), HttpStatus.ACCEPTED);
	}
	@GetMapping("/car_no/{car_no}")
	public ResponseEntity<List<Cars>> getAllByPid(@PathVariable("car_no") int car_no){
		return new ResponseEntity(carService.getCaryPostId(pid),HttpStatus.OK);
	}
}
