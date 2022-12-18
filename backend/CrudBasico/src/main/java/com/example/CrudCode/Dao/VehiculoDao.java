/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.CrudCode.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.CrudCode.Model.Vehiculo;


public interface VehiculoDao extends CrudRepository<Vehiculo, Integer>{
    
}
