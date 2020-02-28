package ynov.jean.clientblog.model;


public class Categorie {

	private Long id_categorie;
	private String nom_categorie;
	
	public Long getId() {
		return id_categorie;
	}
	public void setId(Long id) {
		this.id_categorie = id;
	}
	public String getNom_categorie() {
		return nom_categorie;
	}
	public void setNom_categorie(String nom_categorie) {
		this.nom_categorie = nom_categorie;
	}
}
