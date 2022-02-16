package com.sp.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.sp.gestionStock.dto.UtilisateurDTO;

public class UtilisateurValidator {

	public static List<String> validate(UtilisateurDTO dto){
		
		List<String> errors = new ArrayList<>();
		
		
		if(dto==null) {
			errors.add("Veuillez renseigner le nom d'utilisateur");
			errors.add("Veuillez renseigner le prenom d'utilisateur");
			errors.add("Veuillez renseigner le mot de passe d'utilisateur");
			errors.add("Veuillez renseigner l'adresse d'utilisateur");
			errors.add("Veuillez renseigner l'email d'utilisateur");
			
			return errors;

		}
		
		if(!StringUtils.hasText(dto.getNom())) {
			
			errors.add("Veuillez renseigner le nom d'utilisateur");
		}
		if(!StringUtils.hasText(dto.getPrenom())) {
			
			errors.add("Veuillez renseigner le prenom d'utilisateur");
		}
		if(!StringUtils.hasText(dto.getMotDePasse())) {
			
			errors.add("Veuillez renseigner le mot de passe d'utilisateur");
		}
		if(!StringUtils.hasText(dto.getMail())) {
			
			errors.add("Veuillez renseigner l'email d'utilisateur");
		}
		if(dto.getAdresse()==null) {
			
			errors.add("Veuillez renseigner l'adresse d'utilisateur");
		}
		if(dto.getDateDeNaissance()==null) {
			errors.add("Veuillez renseigner la date de naissance d'utilisateur");

		}
		else {
		
			if(!StringUtils.hasText(dto.getAdresse().getAdresse1())) {
			
			errors.add("Le champs 'adresse 1' est obligatoire");
			}
			
			if(!StringUtils.hasText(dto.getAdresse().getVille())) {
				
				errors.add("Le champs 'Ville' est obligatoire");
				}
			
			if(!StringUtils.hasText(dto.getAdresse().getCodePostale())) {
				
				errors.add("Le champs 'Code postale' est obligatoire");
				}
			
			if(!StringUtils.hasText(dto.getAdresse().getPays())) {
				
				errors.add("Le champs 'Pays' est obligatoire");
				}
		}
		
		
		return errors;
		
	}
	
}
