package com.servicesrest.restdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.CommandLineRunner;


import com.servicesrest.restdata.model.*;

@SpringBootApplication
public class ServiciosRest{

	@Autowired
	EmpleadoRepository empleadoRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(ServiciosRest.class, args);
    }
    /*
    @Override
	public void run(String... args) throws Exception {
		empleadoRepository.save(new Empleado("Smith"));
	}
	*/
}