package ynov.jean.blogbackcategorie.repositories;

import org.springframework.data.repository.CrudRepository;

import ynov.jean.blogbackcategorie.model.Categorie;

public interface CategorieRepository extends CrudRepository<Categorie, Long>{

	public Categorie findByCategorieName(String nom_categorie);
}
