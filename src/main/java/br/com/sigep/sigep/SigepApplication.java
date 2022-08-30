package br.com.sigep.sigep;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import br.com.sigep.entidades.Pessoa;

@EntityScan("br.com.sigep")
@SpringBootApplication
public class SigepApplication implements CommandLineRunner {

	@PersistenceUnit
	EntityManagerFactory factory;
	EntityManager m;

	public static void main(String[] args) {
		SpringApplication.run(SigepApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// m = factory.createEntityManager();
		// Pessoa p = new Pessoa(1, "bernardo@gmail.com", "bernardo");

		// EntityTransaction t = m.getTransaction();
		// t.begin();
		// m.merge(p);
		// m.flush();
		// t.commit(); 
		
	}

}
