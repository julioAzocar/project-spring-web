package com.devpredator.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devpredator.projectspringweb.dao.EmpleadoDAO;
import com.devpredator.projectspringweb.services.SpringService;

@Service
public class SpringServiceImpl implements SpringService {

	@Autowired
	private EmpleadoDAO empleadoDAOImpl;
	
	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con Spring y Jsf test1,Nombre Empresa ";
		
	}
	
	@Override
	public String mostrarNombreEmpleado() {
		return this.empleadoDAOImpl.consultarNombreEmpleado();
		
	}
}
