package com.yujiyamamoto64.carrental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yujiyamamoto64.carrental.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

	List<Car> findByMarcaAndAno(String marca, Integer ano);

	List<Car> findByVendidoFalse();

	List<Car> findByAnoBetween(Integer anoInicial, Integer anoFinal);
}
