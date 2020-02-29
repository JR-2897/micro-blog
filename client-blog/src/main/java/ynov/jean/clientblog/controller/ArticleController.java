package ynov.jean.clientblog.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ynov.jean.clientblog.model.Article;
import ynov.jean.clientblog.proxies.MSArticleProxy;

@Controller
public class ArticleController {

	@Autowired
	private MSArticleProxy articleProxy;
	
	@RequestMapping("/categorie/id_categorie")
	public String categories(Model modelCategories) {
		Optional<Article> articlesCategorie = articleProxy.getArticle(@PathVariable("id_categorie") Long id_categorie);
		
		modelCategories.addAttribute("articlesCategorie", articlesCategorie);
		
		return "CategorieArticles";
	}
	
	@RequestMapping("/${id_article}")
	public String article(Model modelArticle) {
		
		Optional<Article> article = articleProxy.getArticle(${id_article);
	
		modelArticle.addAttribute("article", article);
		
		return "Article";
	}
}
