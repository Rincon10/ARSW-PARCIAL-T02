package edu.eci.arsw.coronavirus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class CoronavirusApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CoronavirusApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", getPort()));
		app.run(args);
	}

	/**
	 *Clase que se encarga de obtener el puerto para Heroku de sus variables de entorno
	 * @return int, que representara el numero de puerto para SpringBoot
	 */
	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 8080;
	}
}
