package com.sp.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.sp.gestionStock.dto.CommandeFournisseurDTO;

public class CommandeFournisseurValidator {
	
	public static List<String> validate(CommandeFournisseurDTO dto){
		
		List<String> errors = new ArrayList<>();
		
		if(dto==null) {
			
			errors.add("Veuillez renseigner le code de la commande");
			errors.add("Veuillez renseigner la date de la commande");
			errors.add("Veuillez selectionner un fournisseur");
			
			return errors;
		}
		
		if(!StringUtils.hasLength(dto.getCode())) {
			errors.add("Veuillez renseigner le code de la commande");
		}
		
		if(dto.getDateCommande()==null) {
			errors.add("Veuillez renseigner la date de la commande");
		}
		
		if(dto.getFournisseur()==null) {
			errors.add("Veuillez selectionner un fournisseur");
		}
		
		return errors;
		
		
		
		
	}

}
