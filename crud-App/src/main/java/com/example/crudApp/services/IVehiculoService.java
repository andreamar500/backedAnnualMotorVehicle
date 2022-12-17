package com.example.crudApp.services;

import java.util.List;

import com.example.crudApp.models.Vehicle;


public interface IVehiculoService {
	public List<Vehicle> findAll();
	
	public void save(Vehicle cliente);
	
	public Vehicle findById(Long id);
	
	public void delete(Vehicle cliente);
}
