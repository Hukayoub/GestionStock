package com.sp.gestionStock.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "articles")
public class Article extends AbstractEntity {
	
	@Column(name="codearticle")
	private String codeArticle;
	
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="prixunitaireHt")
	private BigDecimal prixUnitaireHt;
	
	@Column(name="tauxtva")
	private BigDecimal tauxTva;
	
	@Column(name="prixunitairettc")
	private BigDecimal prixUnitaireTtc;
	
	@Column(name = "photo")
	private String photo;
	
	
	@Column(name="idEntreprise")
	private Integer idEnrtreprise;
	
	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Categorie categorie;
	
	
	@OneToMany(mappedBy = "article")
	private List<MvStk> mvStks;

}
