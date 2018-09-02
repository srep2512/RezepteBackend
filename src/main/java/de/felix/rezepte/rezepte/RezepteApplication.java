package de.felix.rezepte.rezepte;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import de.felix.rezepte.entity.Rezept;
import de.felix.rezepte.entity.RezepteRepository;

@SpringBootApplication
@EntityScan(basePackages = {"de.felix.rezepte.entity"} )
@EnableJpaRepositories(basePackages = {"de.felix.rezepte.entity"})
public class RezepteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RezepteApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(RezepteRepository repository) {
		return (args) -> {
			// save recipes			
			for(int i = 1;i<100;i++) {
				repository.save(new Rezept("Kuchen+i","Details"+i,"Status"+i));
			}			
			
		};
	}
}
