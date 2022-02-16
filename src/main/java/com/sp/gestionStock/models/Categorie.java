package com.sp.gestionStock.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "categories")
public class Categorie extends AbstractEntity{
	
	@Column(name="code")
	private String code;
	
	
	@Column(name="designation")
	private String designation;

	@Column(name="idEntreprise")
	private Integer idEnrtreprise;
	
	@OneToMany(mappedBy = "categorie")
	private List<Article> articles;
}
