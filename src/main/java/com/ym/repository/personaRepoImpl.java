package com.ym.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ym.GusConsolaApplication;

@Repository // Exteriotipo Indica que es manejo de datos, siempre definirlos en el contexto de la clase
public class personaRepoImpl implements iPersonaRepo{
	
	private static Logger LOG = LoggerFactory.getLogger(GusConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		LOG.info("Se registro correctamente un usuario " + nombre + "..!!");
	}

}
