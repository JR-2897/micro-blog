package ynov.jean.blogbackauteur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ynov.jean.blogbackauteur.model.Auteur;
import ynov.jean.blogbackauteur.repositories.AuteurRepository;

@RestController
public class AuteurController {

	@Autowired
	private AuteurRepository auteurRepository;
	
	//Permet d'ajouter des auteurs
	@PostMapping(value = "/add")
	public void addUser(@RequestBody Auteur a) {
		auteurRepository.save(a);
	}
	
	// Permet de se connecter
	@PostMapping(value = "/login")
	public boolean login(@RequestBody Auteur a) {
		String auteur_name = a.getNom_user();
		Auteur auteur = auteurRepository.findByUsername(auteur_name);
		if(a.getPassword().equals(auteur.getPassword())) {
			return true;
		}
		return false;
	}
}
