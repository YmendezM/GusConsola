package com.ym;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GusConsolaApplication implements CommandLineRunner {
	private static Logger LOG = LoggerFactory.getLogger(GusConsolaApplication.class);
	public static String RutaLogServicio = "/Users/ysrael/Source/Logs/LogsConsolaGus/";

	public static void main(String[] args) {
		SpringApplication.run(GusConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		 LoggerFisico logObject = new LoggerFisico(RutaLogServicio);// instancia objeto para escribir logs del servicio
	     org.apache.log4j.Logger log = logObject.getLog();

		
		// TODO Auto-generated method stub
		System.out.println("Estoy es una PRUEBA GUS");
		LOG.info("Ysrael esta creando GUS");
		log.info("Esta prueba esta corriendo el log de Gus");
		LOG.info("El Log se escribio correctamente..!!");
	}

}
