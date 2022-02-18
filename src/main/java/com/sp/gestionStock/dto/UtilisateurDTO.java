package com.sp.gestionStock.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sp.gestionStock.models.Utilisateur;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class UtilisateurDTO {

	private Integer id;
	
	private String nom;
	
	
	private String prenom;
	
	private AdresseDTO adresse;

	private String photo;
	
	private String mail;
	
	private Instant dateDeNaissance;
	
	private String motDePasse;

	private EntrepriseDTO utilisateurEntreprise;
	
	@JsonIgnore
	private List<RolesDTO> roles;
	
	

	public static UtilisateurDTO fromEntity(Utilisateur utilisateur) {
		if(utilisateur==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  UtilisateurDTO.builder()
				.nom(utilisateur.getNom())
				.prenom(utilisateur.getPrenom())
				.adresse(AdresseDTO.fromEntity(utilisateur.getAdresse()))
				.photo(utilisateur.getPhoto())
				.mail(utilisateur.getMail())
				.dateDeNaissance(utilisateur.getDateDeNaissance())
				.motDePasse(utilisateur.getMotDePasse())
				.utilisateurEntreprise(EntrepriseDTO.fromEntity(utilisateur.getUtilisateurEntreprise()))
				.build();
		
	}
	
	public static Utilisateur toEntity(UtilisateurDTO utilisateurDTO) {
		
		if(utilisateurDTO==null) {
			return null;
			//TODO throw an exception
			
		}
		Utilisateur utilisateur = new Utilisateur();
		
		utilisateur.setNom(utilisateurDTO.getNom());
		utilisateur.setPrenom(utilisateurDTO.getPrenom());
		utilisateur.setPhoto(utilisateurDTO.getPhoto());
		utilisateur.setMail(utilisateurDTO.getMail());
		utilisateur.setDateDeNaissance(utilisateurDTO.getDateDeNaissance());
		utilisateur.setMotDePasse(utilisateurDTO.getMotDePasse());


	
		return utilisateur;

}
}
