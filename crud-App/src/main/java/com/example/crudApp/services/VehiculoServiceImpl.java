package com.example.crudApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.crudApp.dao.IVehiculoDao;
import com.example.crudApp.models.Vehicle;


@Service
public class VehiculoServiceImpl implements IVehiculoService{
	@Autowired
	private IVehiculoDao vehiculoDao;	
	@Override
	@Transactional(readOnly = true)
	public List<Vehicle> findAll() {
		return (List<Vehicle>) vehiculoDao.findAll();
	}

	@Override
	@Transactional
	public void save(Vehicle cliente) {
		vehiculoDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Vehicle findById(Long id) {
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Vehicle cliente) {
		vehiculoDao.delete(cliente);
		
	}
}
