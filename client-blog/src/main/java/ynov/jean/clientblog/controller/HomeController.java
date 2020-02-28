package ynov.jean.clientblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ynov.jean.clientblog.proxies.MSArticleProxy;
import ynov.jean.clientblog.proxies.MSCategorieProxy;
import ynov.jean.clientblog.model.Article;
import ynov.jean.clientblog.model.Categorie;

@Controller
public class HomeController {

	@Autowired
    private MSCategorieProxy categorieProxy;
	private MSArticleProxy articleProxy;
	
	@RequestMapping("/")
    public String accueil(Model modelAcceuil){

        List<Categorie> categories =  categorieProxy.getCategories();

        modelAcceuil.addAttribute("categories", categories);

        return "Home";
    }
	
	@RequestMapping("/{id_categorie}")
	public String categories(Model modelCategories) {
		Optional<Article> articlesCategorie = articleProxy.getArticle(@PathVariable("id_categorie") Long id_categorie);
		
		modelCategories.addAttribute("articlesCategorie", articlesCategorie);
		
		return "CategorieArticles";
	}
}
