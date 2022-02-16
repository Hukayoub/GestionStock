package com.sp.gestionStock.models;

import java.math.BigDecimal;
import java.time.Instant;

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
@Table(name = "mvStck")
public class MvStk extends AbstractEntity{

	@Column(name="datemvt")
	private Instant dateMvt;
	
	@Column(name="quntite")
	private BigDecimal quantite;
	
	@Column(name="idEntreprise")
	private Integer idEnrtreprise;
	
	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article;
	
	@Column(name="typemvt")
	private TypeMvtStk typeMvt;
}
