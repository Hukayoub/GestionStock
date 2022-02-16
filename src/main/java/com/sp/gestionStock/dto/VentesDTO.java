package com.sp.gestionStock.dto;

import java.time.Instant;

import com.sp.gestionStock.models.LigneVente;
import com.sp.gestionStock.models.Ventes;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VentesDTO {

	private Integer id;
	
	private String code;
	
	private Instant dateVente;
	
	private String commentaire;
	
	
	public VentesDTO fromEntity(Ventes ventes ) {
		
		if(ventes == null) {
			
			return null;
			//throw new exception 
			
		}
		
		return VentesDTO.builder()
		.code(getCode())
		.dateVente(getDateVente())
		.commentaire(getCommentaire())
		.build();
	}
	
	public Ventes toEntity(VentesDTO ventesDTO) {
		
		if(ventesDTO == null) {
			
			return null;
			//throw new Exception
			
		}
		
		Ventes ventes = new Ventes();
		ventes.setCode(ventesDTO.getCode());
		ventes.setDateVente(ventesDTO.getDateVente());
		ventes.setCommentaire(ventesDTO.getCommentaire());

		return ventes;
	}
}
