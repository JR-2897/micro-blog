package ynov.jean.blogbackarticles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ynov.jean.blogbackarticles.model.Articles;
import ynov.jean.blogbackarticles.repositories.ArticleRepositories;

@RestController
public class ArticleController {

	@Autowired
	private ArticleRepositories articleRepository;
	
	// Permet d'ajouter des articles
	@PostMapping(value = "/add")
	public void addArticle(@RequestBody Articles a){
		articleRepository.save(a);
	}
}