package com.sp.gestionStock.dto;

import com.sp.gestionStock.models.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDTO {
	
	private String adresse1;
	
	
	private String adresse2;
	

	private String ville;
	
	
	private String codePostale;
	
	
	private String pays;
	
	
	public AdresseDTO fromEntity(Adresse adresse) {
		if(adresse==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  AdresseDTO.builder()
				.adresse1(adresse.getAdresse1())
				.adresse2(adresse.getAdresse2())
				.ville(adresse.getVille())
				.codePostale(adresse.getCodePostale())
				.pays(adresse.getPays())
				.build();
		
	}
	
	public Adresse toEntity(AdresseDTO adresseDTO) {
		
		if(adresseDTO==null) {
			return null;
			//TODO throw an exception
			
		}
		Adresse adresse = new Adresse();
		
		adresse.setAdresse1(adresseDTO.getAdresse1());
		adresse.setAdresse2(adresseDTO.getAdresse2());
		adresse.setVille(adresseDTO.getVille());
		adresse.setCodePostale(adresseDTO.getCodePostale());
		adresse.setPays(adresseDTO.getPays());
		
		
		return adresse;
	}
}
