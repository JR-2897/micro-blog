package ynov.jean.clientblog.proxies;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ynov.jean.clientblog.model.Article;

@FeignClient(name= "blogbackarticles")
@RibbonClient(name= "blogbackarticles")

public interface MSArticleProxy {

	@GetMapping(value = "/articles/{id_categorie}")
	List<Article> getArticles();
	
	@GetMapping(value = "/categories/{id}")
	Optional<Article> getArticle(@PathVariable("id") Long id);
	
	
}
