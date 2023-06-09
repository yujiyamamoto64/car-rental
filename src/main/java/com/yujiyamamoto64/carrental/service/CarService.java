package com.yujiyamamoto64.carrental.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
	
	public Optional<Car> findById(Long id) {
		Optional<Car> obj = carRepository.findById(id);
		return obj;		
	}
	
	public Car update(Car obj) {
		Car newObj = findById(obj.getId()).get();
		newObj.setVeiculo(obj.getVeiculo());
		newObj.setMarca(obj.getMarca());
		newObj.setDescricao(obj.getDescricao());
		newObj.setAno(obj.getAno());
		newObj.setVendido(obj.getVendido());
		newObj.setUpdated(new Date());
		return carRepository.save(newObj);
	}
	
	public void delete (Long id) {
		findById(id);
		carRepository.deleteById(id);
	}
	
	public List<Car> findAll() {
		return carRepository.findAll();
	}

	public List<Car> findByMarcaAndAno(String marca, Integer ano) {
		return carRepository.findByMarcaAndAno(marca, ano);
	}

	public List<Car> findByVendidoFalse() {
		return carRepository.findByVendidoFalse();
	}

	public List<Car> findByAnoBetween(Integer anoInicial, Integer anoFinal) {
		return carRepository.findByAnoBetween(anoInicial, anoFinal);
	}
}
