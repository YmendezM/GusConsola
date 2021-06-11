package com.ym.service;

import com.ym.repository.iPersonaRepo;
import com.ym.repository.personaRepoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service // Exteriotipo Indica que es logica de negocios.
public class iPersonaServiceImpl implements iPersonaService{
	
	@Autowired
	@Qualifier("persona2")// Esto es util cuando necesitamos realizar alguna otra implemntación
	private iPersonaRepo repo;

	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		//repo = new personaRepoImpl(); // Creara una instancia por cada n usuarios en uso, Autowired accedo a la instancia definida en el contenerdor spring.
		repo.registrar(nombre);
		
	}

}
