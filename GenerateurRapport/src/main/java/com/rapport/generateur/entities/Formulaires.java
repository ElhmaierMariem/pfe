package com.rapport.generateur.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="FORMULAIRES")
public class Formulaires implements Serializable {
	 @OneToMany(mappedBy = "critereDeRechercheIdFk" )
	 private List<Rapports> listFormulaireChamps;
	
	
	  @OneToMany(mappedBy = "resultatEnteteId" ) private List<Rapports>
	  listFormulaireChamps1;
	 
	 
	 @OneToMany(mappedBy = "formulairesIdFk")
	 private List<FormulaireChamps> listFormulaires;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="FORMULAIRES_ID")
	private Long formulairesId;
     @Column(name="LIBELLE")
    private String formulairesLibelle;
     @Column(name="NOMBRE_COLONNES")
    private Long formulairesNombreColonnes;
	
	
     
     /** ****************Getters and Setters ********************* **/
     
     public Long getFormulaireId() {
 		return formulairesId;
 	}
 	public void setFormulaireId(Long formulaireId) {
 		this.formulairesId = formulaireId;
 	}
 	public String getFormulairesLibelle() {
 		return formulairesLibelle;
 	}
 	public void setFormulairesLibelle(String formulairesLibelle) {
 		this.formulairesLibelle = formulairesLibelle;
 	}
 	public Long getFormulairesNombreColonnes() {
 		return formulairesNombreColonnes;
 	}
 	public void setFormulairesNombreColonnes(Long formulairesNombreColonnes) {
 		this.formulairesNombreColonnes = formulairesNombreColonnes;
 	}
 	
 	/** ************** Constructor ********************* **/
	public Formulaires(String formulairesLibelle, Long formulairesNombreColonnes) {
		super();
		this.formulairesLibelle = formulairesLibelle;
		this.formulairesNombreColonnes = formulairesNombreColonnes;
	}
	public Formulaires() {
		super();
		// TODO Auto-generated constructor stub
	}
	
 	
}
