/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CrudCode.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudCode.Model.Vehiculo;
import com.example.CrudCode.Service.VehiculoService;


@RestController
@RequestMapping("/api")
public class VehiculoController {
    @Autowired
    private VehiculoService vehiculoService;
    
    //listar la población de vehiculos
    @GetMapping("/vehiculos")
    public List<Vehiculo> listar()
    {
        return vehiculoService.findAll();
    }
    
    //guardar la población de vehiculos
    @PostMapping("/vehiculos")
    public  Vehiculo guardar(@RequestBody Vehiculo vehiculo)
    {
        return vehiculoService.save(vehiculo);
    }
    
    //buscar por id
    @GetMapping("/vehiculos/{id}")
    public Vehiculo getVehiculo(@PathVariable Integer id)
    {
        return vehiculoService.findById(id);
    }
    
    //Editar
    @PutMapping("/vehiculos/{id}")
    public Vehiculo update(@RequestBody Vehiculo vehiculo,@PathVariable Integer id)
    {
        Vehiculo v= vehiculoService.findById(id);
        v.setAnio(vehiculo.getAnio());
        v.setCategoria(vehiculo.getCategoria());
        v.setTipo(vehiculo.getTipo());
        v.setNumVehiculos(vehiculo.getNumVehiculos());
        
        return vehiculoService.save(v);
    }
    
    @DeleteMapping("/vehiculos/{id}")
    public void eliminar(@PathVariable Integer id)
    {
        vehiculoService.delete(id);
    }
    
}
