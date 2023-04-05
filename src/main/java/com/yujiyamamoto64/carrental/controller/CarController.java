package com.yujiyamamoto64.carrental.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Void> update (@RequestBody Car obj, @PathVariable Long id) {
		obj.setId(id);
		obj = carService.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete (@PathVariable Long id) {
		carService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Car>> findAll() {
		List<Car> list = carService.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		Optional<Car> obj = carService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{marca}/{ano}")
	public ResponseEntity<List<Car>> findByMarcaAndAno(@PathVariable String marca, @PathVariable Integer ano) {
		List<Car> list = carService.findByMarcaAndAno(marca, ano);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/unsolds")
	public ResponseEntity<List<Car>> findByVendidoFalse() {
		List<Car> list = carService.findByVendidoFalse();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/decade/{anoInicial}/{anoFinal}")
	public ResponseEntity<List<Car>> findByDecade(@PathVariable Integer anoInicial, @PathVariable Integer anoFinal) {
		List<Car> list = carService.findByAnoBetween(anoInicial, anoFinal);
		return ResponseEntity.ok().body(list);
	}
	
}
