package com.sp.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.sp.gestionStock.dto.EntrepriseDTO;

public class EntrepriseValidator {
	
	public static List<String> validate(EntrepriseDTO dto){
		
		List<String> errors = new ArrayList<>();
		
		if(dto==null) {
			
			errors.add("Veuillez renseigner le nom de l'entreprise");
			errors.add("Veuillez renseigner le code fiscal de l'entreprise");
			errors.add("Veuillez renseigner l'email de l'entreprise");
			errors.add("Veuillez renseigner le numéro de téléphone de l'entreprise");
			errors.add("Veuillez renseigner l'adresse de l'entreprise");
			
			return errors;

		}
		
		if(!StringUtils.hasLength(dto.getNom())) {
			
			errors.add("Veuillez renseigner le nom de l'entreprise");
			
		}
		
		if(!StringUtils.hasLength(dto.getCodeFiscal())) {
			
			errors.add("Veuillez renseigner le code fiscal de l'entreprise");
			
		}
		if(!StringUtils.hasLength(dto.getMail())) {
			
			errors.add("Veuillez renseigner l'email de l'entreprise");
			
		}
		if(!StringUtils.hasLength(dto.getNumTel())) {
			
			errors.add("Veuillez renseigner le numéro de téléphone de l'entreprise");
			
		}else {
		
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
