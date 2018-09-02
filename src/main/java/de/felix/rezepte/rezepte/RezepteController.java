package de.felix.rezepte.rezepte;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.felix.rezepte.entity.Rezept;
import de.felix.rezepte.entity.RezepteRepository;

@RestController
public class RezepteController {
	
	@Autowired
	RezepteRepository repo;

	@RequestMapping("/rezepte")
	@CrossOrigin
	public List<Rezept> getRezepte(){
		return repo.findAll();
	}
}
