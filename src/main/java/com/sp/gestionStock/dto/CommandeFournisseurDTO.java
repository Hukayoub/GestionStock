package com.sp.gestionStock.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
				.id(getId())
				.code(getCode())
				.dateCommande(getDateCommande())
				.fournisseur(FournisseurDTO.fromEntity(cdeFournisseur.getFournisseur()))
				.fournisseurEntreprise(EntrepriseDTO.fromEntity(cdeFournisseur.getFournisseurEntreprise()))
				.build();
		
	}
	
	public CommandeFournisseur toEntity(CommandeFournisseurDTO cdeFournisseurDto) {
		
		if(cdeFournisseurDto==null) {
			return null;
			//TODO throw an exception
			
		}
		CommandeFournisseur cdf = new CommandeFournisseur();
		
		cdf.setId(cdeFournisseurDto.getId());
		cdf.setCode(cdeFournisseurDto.getCode());
		cdf.setDateCommande(cdeFournisseurDto.getDateCommande());
	
		return cdf;
	}
}
