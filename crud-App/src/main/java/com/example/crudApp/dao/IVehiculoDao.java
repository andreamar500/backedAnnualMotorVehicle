package com.example.crudApp.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.crudApp.models.Vehicle;

public interface IVehiculoDao extends CrudRepository<Vehicle, Long>{

}
