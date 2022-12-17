package com.example.crudApp.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehiculos")
public class Vehicle {
	@Id
	@Column(name="id",nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="anio")
	private Integer anio;
	@Column(name="categoria")
	private String categoria;
	@Column(name="tipo")
	private String tipo;
	@Column(name="numVehiculos")
	private String numVehiculos;	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumVehiculos() {
		return numVehiculos;
	}

	public void setNumVehiculos(String numVehiculos) {
		this.numVehiculos = numVehiculos;
	}

}
