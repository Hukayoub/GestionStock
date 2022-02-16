package com.sp.gestionStock.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ligneVente")
public class LigneVente extends AbstractEntity{

	@Column(name="idEntreprise")
	private Integer idEnrtreprise;
	
	@ManyToOne
	@JoinColumn(name="idvente")
	private Ventes vente;
	
	@Column(name="quantite")
	private BigDecimal quantite;
	
}
