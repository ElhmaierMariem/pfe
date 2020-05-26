package com.rapport.generateur.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="TYPE_CHAMPS")
public class TypeChamps implements Serializable {
  @OneToMany(mappedBy = "typeChampsIdFk")
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TYPE_CHAMPS_ID")
	private Long typeChampsId;
    @Column(name="LIBELLE")
    private String typeChampsLibelle;
    
    /** *********Getters and Setters*********** **/
    
    
	public Long getTypeChampsId() {
		return typeChampsId;
	}
	public void setTypeChampsId(Long typeChampsId) {
		this.typeChampsId = typeChampsId;
	}
	public String getTypeChampsLibelle() {
		return typeChampsLibelle;
	}
	public void setTypeChampsLibelle(String typeChampsLibelle) {
		this.typeChampsLibelle = typeChampsLibelle;
	}
	
	/** ************Enumeration************** **/
	
	@Enumerated(EnumType.STRING)
	private TypeDeChamps typeDeChamps;
	
	/** ***********Constructor************* **/
	
	public TypeChamps(Long typeChampsId, String typeChampsLibelle) {
		super();
		this.typeChampsId = typeChampsId;
		this.typeChampsLibelle = typeChampsLibelle;
	}
	public TypeChamps() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
     
}
