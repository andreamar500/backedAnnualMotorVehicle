/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.CrudCode.Service;

import java.util.List;

import com.example.CrudCode.Model.Vehiculo;

public interface VehiculoService {
    public List<Vehiculo> findAll();
    public Vehiculo save(Vehiculo vehiculo);
    public Vehiculo findById(Integer id);
    public void delete(Integer id);
    
}
