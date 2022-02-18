package com.sp.gestionStock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sp.gestionStock.models.Entreprise;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntrepriseDTO {
	
	private Integer id;
	
	private String nom;
	
	
	private String description;
	
	
	private AdresseDTO adresse;
	
	
	private String codeFiscal;
	
	
	private String photo;
	
	
	private String mail;
	
	
	private String numTel; 
	
	@JsonIgnore
	private List<UtilisateurDTO> utilisateurs;
	
	@JsonIgnore
	private List<CommandeFournisseurDTO> commandeFournisseurs;
	
	public static EntrepriseDTO fromEntity(Entreprise entreprise) {
		if(entreprise==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  EntrepriseDTO.builder()
				.nom(entreprise.getNom())
				.description(entreprise.getDescription())
				.adresse(AdresseDTO.fromEntity(entreprise.getAdresse()))
				.codeFiscal(entreprise.getCodeFiscal())
				.photo(entreprise.getPhoto())
				.mail(entreprise.getMail())
				.numTel(entreprise.getNumTel())
				.build();
		
	}
	
	public static Entreprise toEntity(EntrepriseDTO entrepriseDto) {
		
		if(entrepriseDto==null) {
			return null;
			//TODO throw an exception
			
		}
		Entreprise entreprise = new Entreprise();
		
		entreprise.setNom(entrepriseDto.getNom());
		entreprise.setDescription(entrepriseDto.getDescription());
		entreprise.setCodeFiscal(entrepriseDto.getCodeFiscal());
		entreprise.setPhoto(entrepriseDto.getPhoto());
		entreprise.setMail(entrepriseDto.getMail());
		entreprise.setNumTel(entrepriseDto.getNumTel());


	
		return entreprise;
	}

}
