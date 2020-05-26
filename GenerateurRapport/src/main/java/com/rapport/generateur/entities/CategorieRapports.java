package com.rapport.generateur.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="CATEGORIE_RAPPORTS")
public class CategorieRapports implements Serializable {
	 @OneToMany(mappedBy = "categorieRapportIdFk") 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CATEGORIE_RAPPORT_ID")
	private Long categorieRapportId;
	@Column(name="LIBELLE")
	private String categorieLibelle;
	
	/** **************** Getters and Setters ************************ **/
	public Long getCategorieRapportId() {
		return categorieRapportId;
	}
	public void setCategorieRapportId(Long categorieRapportId) {
		this.categorieRapportId = categorieRapportId;
	}
	public String getCategorieLibelle() {
		return categorieLibelle;
	}
	public void setCategorieLibelle(String categorieLibelle) {
		this.categorieLibelle = categorieLibelle;
	}
	
	/** ******************Constructor **************************** **/
	public CategorieRapports(String categorieLibelle) {
		super();
		this.categorieLibelle = categorieLibelle;
	}
	

	public CategorieRapports() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

