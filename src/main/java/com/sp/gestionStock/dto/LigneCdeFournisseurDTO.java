package com.sp.gestionStock.dto;


import com.sp.gestionStock.models.LigneCdeFournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCdeFournisseurDTO {


	private Integer id;
	
	private ArticleDTO article;
	
	
	private CommandeFournisseurDTO commandeFournisseur;
	
	
	public LigneCdeFournisseurDTO fromEntity(LigneCdeFournisseur cdeFournisseur) {
		if(cdeFournisseur==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  LigneCdeFournisseurDTO.builder()
				.id(cdeFournisseur.getId())
				.article(ArticleDTO.fromEntity(cdeFournisseur.getArticle()))
				.commandeFournisseur(getCommandeFournisseur())
				.build();
		
	}
	
	public LigneCdeFournisseur toEntity(LigneCdeFournisseurDTO cdeFournisseurDTO) {
		
		if(cdeFournisseurDTO==null) {
			return null;
			//TODO throw an exception
			
		}
		LigneCdeFournisseur fournisseur = new LigneCdeFournisseur();
		
		fournisseur.setId(cdeFournisseurDTO.getId());

		return fournisseur;

}
}

