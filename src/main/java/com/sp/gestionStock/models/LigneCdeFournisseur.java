package com.sp.gestionStock.models;

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
@Table(name = "ligneCdeFournisseur")
public class LigneCdeFournisseur extends AbstractEntity{

	@Column(name="idEntreprise")
	private Integer idEnrtreprise;
	
	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idcommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;
}
