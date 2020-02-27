package ynov.jean.blogbackauteur.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ynov.jean.blogbackauteur.model.Auteur;

@Repository
public interface AuteurRepository extends CrudRepository<Auteur, Long> {

	public Auteur findByUsername(String nom_user);
}
