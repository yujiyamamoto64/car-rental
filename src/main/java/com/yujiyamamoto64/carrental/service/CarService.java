package com.yujiyamamoto64.carrental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yujiyamamoto64.carrental.model.Car;
import com.yujiyamamoto64.carrental.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;

	public Car insert(Car obj) {
		obj = carRepository.save(obj);
		return obj;
	}
}
