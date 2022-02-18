package com.sp.gestionStock.dto;

import com.sp.gestionStock.models.LigneCdeClt;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCdeClientDTO {

	private Integer id;
	
	private ArticleDTO article;
	

	private CommandeClientDTO commandeClient;
	
	
	public LigneCdeClientDTO fromEntity(LigneCdeClt cdeClt) {
		if(cdeClt==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  LigneCdeClientDTO.builder()
				.id(cdeClt.getId())
				.article(ArticleDTO.fromEntity(cdeClt.getArticle()))
				.commandeClient(CommandeClientDTO.fromEntity(cdeClt.getCommandeClient()))
				.build();
		
	}
	
	public LigneCdeClt toEntity(LigneCdeClientDTO cdeClientDTO) {
		
		if(cdeClientDTO==null) {
			return null;
			//TODO throw an exception
			
		}
		LigneCdeClt ligneCdeClt = new LigneCdeClt();
		
		ligneCdeClt.setId(cdeClientDTO.getId());

		return ligneCdeClt;

}

}
