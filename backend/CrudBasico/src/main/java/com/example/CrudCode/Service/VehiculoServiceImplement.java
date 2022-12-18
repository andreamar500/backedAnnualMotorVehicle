/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CrudCode.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.CrudCode.Dao.VehiculoDao;
import com.example.CrudCode.Model.Vehiculo;

@Service
public class VehiculoServiceImplement  implements VehiculoService{
    @Autowired
    private VehiculoDao vehiculoDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Vehiculo> findAll()
    {
        return (List<Vehiculo>) vehiculoDao.findAll();
    }
    
    @Override
     @Transactional(readOnly=false)
    public Vehiculo save(Vehiculo vehiculo)
    {
        return vehiculoDao.save(vehiculo);
    }
    
    @Override
     @Transactional(readOnly=true)
    public Vehiculo findById(Integer id)
    {
        return vehiculoDao.findById(id).orElse(null);
    }
    
    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        vehiculoDao.deleteById(id);
    }
    
}
