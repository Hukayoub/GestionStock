package com.sp.gestionStock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sp.gestionStock.models.Entreprise;
import com.sp.gestionStock.models.Fournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FournisseurDTO {

	private Integer id;
	
	private String nom;
	
	
	private String prenom;
	
	
	private AdresseDTO adresse;

	
	private String photo;
	
	
	private String mail;
	
	
	private String numTel;
	
	@JsonIgnore
	private List<CommandeFournisseurDTO> commandeFournisseurs;
	
	
	public static FournisseurDTO fromEntity(Fournisseur fournisseur) {
		if(fournisseur==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  FournisseurDTO.builder()
				.nom(getNom())
				.prenom(getPrenom())
				.adresse(getAdresse())
				.photo(getPhoto())
				.mail(getMail())
				.numTel(getNumTel())
				.build();
		
	}
	
	public static Fournisseur toEntity(FournisseurDTO fournisseurDto) {
		
		if(fournisseurDto==null) {
			return null;
			//TODO throw an exception
			
		}
		Fournisseur fournisseur = new Fournisseur();
		
		fournisseur.setNom(fournisseurDto.getNom());
		fournisseur.setPrenom(fournisseurDto.getPrenom());
		fournisseur.setAdresse(fournisseurDto.getAdresse());
		fournisseur.setPhoto(fournisseurDto.getPhoto());
		fournisseur.setMail(fournisseurDto.getMail());
		fournisseur.setNumTel(fournisseurDto.getNumTel());


	
		return fournisseur;

}
}
