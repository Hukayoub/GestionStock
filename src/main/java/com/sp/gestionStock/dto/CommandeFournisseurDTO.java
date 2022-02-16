package com.sp.gestionStock.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sp.gestionStock.models.Article;
import com.sp.gestionStock.models.CommandeFournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDTO {


	private Integer id;
	
	private String code;
	
	
	private Instant dateCommande;
	
	
	private FournisseurDTO fournisseur;
	
	@JsonIgnore
	private List<LigneCdeClientDTO> ligneCommandeFournisseur;
	
	
	private EntrepriseDTO fournisseurEntreprise;
	
	public CommandeFournisseurDTO fromEntity(CommandeFournisseur cdeFournisseur) {
		if(cdeFournisseur==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  CommandeFournisseurDTO.builder()
				.code(getCode())
				.dateCommande(getDateCommande())
				.fournisseur(getFournisseur())
				.fournisseurEntreprise(getFournisseurEntreprise())
				.build();
		
	}
	
	public CommandeFournisseur toEntity(CommandeFournisseurDTO cdeFournisseurDto) {
		
		if(cdeFournisseurDto==null) {
			return null;
			//TODO throw an exception
			
		}
		CommandeFournisseur cdf = new CommandeFournisseur();
		
		cdf.setCode(cdeFournisseurDto.getCode());
		cdf.setDateCommande(cdeFournisseurDto.getDateCommande());
		cdf.setFournisseur(cdeFournisseurDto.getFournisseur());
		cdf.setFournisseurEntreprise(cdeFournisseurDto.getFournisseurEntreprise());
	
		return cdf;
	}
}
