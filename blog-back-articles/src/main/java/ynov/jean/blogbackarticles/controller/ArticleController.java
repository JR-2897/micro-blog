package ynov.jean.blogbackarticles.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping(value = "/user/{id_article}")
	public Optional<Articles> getArticle(@PathVariable long id_article){
		return articleRepository.findById(id_article);
	}
	
}