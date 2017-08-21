package com.servicesrest.restdata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description = "EMPLEADO")
public class Empleado {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	@ApiModelProperty(dataType = "Numero", value="Identificador del empleado")
    private Long id;
	@ApiModelProperty(dataType = "Cadena", value="Nombre del empleado")
    private String nombre;
	@ApiModelProperty(dataType = "Cadena", value="Apellido paterno del empleado")
    private String apellido;
	@ApiModelProperty(dataType = "Cadena", value="Telefono del empleado")
    private String telefono;
    
    public Empleado() {
    }
    
    public Empleado(String nombre){
		this.nombre = nombre;
	}
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setAllEmpleado(String nombre, String apellido, String telefono){
		this.nombre = nombre;
		this.apellido = apellido;
        this.telefono = telefono;
    }

}
