package com.sp.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.sp.gestionStock.dto.CommandeClientDTO;

public class CommandeClientValidator {
	
	public static List<String> validate(CommandeClientDTO dto){
		
		List<String> errors = new ArrayList<>();
		
		if(dto==null) {
			
			errors.add("Veuillez renseigner le code de la commande");
			errors.add("Veuillez renseigner la date de la commande");
			errors.add("Veuillez selectionner un client");
			
			return errors;
		}
		
		if(!StringUtils.hasLength(dto.getCode())) {
			errors.add("Veuillez renseigner le code de la commande");
		}
		
		if(dto.getDateCommande()==null) {
			errors.add("Veuillez renseigner la date de la commande");
		}
		
		if(dto.getClient()==null) {
			errors.add("Veuillez selectionner un client");
		}
		
		return errors;
		
	}

}
