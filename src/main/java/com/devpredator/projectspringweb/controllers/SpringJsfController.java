package com.devpredator.projectspringweb.controllers;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import com.devpredator.projectspringweb.services.SpringService;
//controlador integracion de spring con jsf 
@ManagedBean
@ViewScoped
public class SpringJsfController {

	//OBJETO SIN SPRING 
		//SpringService springService = new SpringServiceImpl();
	
	private String nombreEmpresa;
	private String nombreEmpleado;
	
	@ManagedProperty("#{springServiceImpl}")
	private SpringService springServiceImpl;
	
	
	@PostConstruct
	public void init() {
		
		String nombre = springServiceImpl.mostrarNombreEmpresa();
		System.out.println(nombre);
		this.nombreEmpresa = nombre;
		
		String nombreEmp = springServiceImpl.mostrarNombreEmpleado();
		System.out.println(nombreEmp);
		this.nombreEmpleado = nombreEmp;
	}

	public SpringService getSpringServiceImpl() {
		return springServiceImpl;
	}


	public void setSpringServiceImpl(SpringService springServiceImpl) {
		this.springServiceImpl = springServiceImpl;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}


}
