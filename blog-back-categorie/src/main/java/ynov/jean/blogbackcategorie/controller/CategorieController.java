package ynov.jean.blogbackcategorie.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ynov.jean.blogbackcategorie.model.Categorie;
import ynov.jean.blogbackcategorie.repositories.CategorieRepository;

@RestController
public class CategorieController {

	@Autowired
	private CategorieRepository categorieRepository;
	
	// Permet d'ajouter des categories
		@PostMapping(value = "/add")
		public void addCategorie(@RequestBody Categorie c) {
			categorieRepository.save(c);
		}
		
		@GetMapping(value = "/categorie/{id_categorie}")
		public Optional<Categorie> getCategorie(@PathVariable long id_categorie){
			return categorieRepository.findById(id_categorie);
		}
}
