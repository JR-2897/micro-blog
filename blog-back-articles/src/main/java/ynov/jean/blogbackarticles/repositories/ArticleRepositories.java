package ynov.jean.blogbackarticles.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ynov.jean.blogbackarticles.model.Articles;

@Repository
public interface ArticleRepositories extends CrudRepository<Articles, Long> {

	public Articles findByUserName(String nom_article);
}
