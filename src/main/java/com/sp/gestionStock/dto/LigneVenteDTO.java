package com.sp.gestionStock.dto;

import java.math.BigDecimal;

import com.sp.gestionStock.models.LigneVente;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVenteDTO {

	private Integer id;
	
	private VentesDTO vente;
	
	private BigDecimal quantite;
	
	public LigneVenteDTO fromEntity(LigneVente ligneVente ) {
		
		if(ligneVente == null) {
			
			return null;
			//throw new exception 
			
		}
		
		return LigneVenteDTO.builder()
		.id(ligneVente.getId())
		.vente(VentesDTO.fromEntity(ligneVente.getVente()))
		.quantite(ligneVente.getQuantite())
		.build();
	}
	
	public LigneVente toEntity(LigneVenteDTO ligneVenteDTO) {
		
		if(ligneVenteDTO == null) {
			
			return null;
			//throw new Exception
			
		}
		
		LigneVente ligneVente = new LigneVente();
		ligneVente.setId(ligneVenteDTO.getId());
		ligneVente.setQuantite(ligneVenteDTO.getQuantite());
		
		return ligneVente;
	}
	
}
