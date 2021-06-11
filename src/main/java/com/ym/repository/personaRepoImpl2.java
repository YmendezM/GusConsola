package com.ym.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.ym.GusConsolaApplication;

@Repository // Exteriotipo Indica que es manejo de datos, siempre definirlos en el contexto de la clase
@Qualifier("persona2")
public class personaRepoImpl2 implements iPersonaRepo {
	private static Logger LOG = LoggerFactory.getLogger(GusConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		LOG.info("No se registro correctamente un usuario " + nombre + "..!!");
	}

}
