package com.servicesrest.restdata.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.servicesrest.restdata.model.Empleado;


public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
	List<Empleado> findByNombre(@Param("name") String name);
}
