package ynov.jean.blogbackarticles.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Articles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_article")
	private Long id_article;
	@Column(name="nom_article")
	private String nom_article;
	@Column(name="nom_user")
	private String nom_user;
	@Column(name="date")
	private Date date;
	@Column(name="contenu")
	private String contenu;
	@Column(name="id_comm")
	private Long id_comm;
	
	public Long getId_article() {
		return id_article;
	}
	public void setId_article(Long id_article) {
		this.id_article = id_article;
	}
	public String getNom_article() {
		return nom_article;
	}
	public void setNom_article(String nom_article) {
		this.nom_article = nom_article;
	}
	public String getNom_user() {
		return nom_user;
	}
	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Long getId_comm() {
		return id_comm;
	}
	public void setId_comm(Long id_comm) {
		this.id_comm = id_comm;
	}
}
