package com.yujiyamamoto64.carrental.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.yujiyamamoto64.carrental.model.Car;
import com.yujiyamamoto64.carrental.service.CarService;

@RestController
@RequestMapping(value = "/car")
public class CarController {

	@Autowired
	private CarService carService;
	
	//Permitir o cadastro de veículos
	@PostMapping
	public ResponseEntity<Car> insert(@RequestBody Car obj) {
		obj = carService.insert(obj);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.buildAndExpand()
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
}