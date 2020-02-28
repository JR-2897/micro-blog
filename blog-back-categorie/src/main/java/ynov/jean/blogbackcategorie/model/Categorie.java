package ynov.jean.blogbackcategorie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_categorie")
	private Long id_categorie;
	@Column(name="nom_categorie")
	private String nom_categorie;
	
	public Long getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(Long id_categorie) {
		this.id_categorie = id_categorie;
	}
	public String getNom_categorie() {
		return nom_categorie;
	}
	public void setNom_categorie(String nom_categorie) {
		this.nom_categorie = nom_categorie;
	}
	
}
