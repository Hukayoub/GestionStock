package com.sp.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import com.sp.gestionStock.dto.LigneCdeFournisseurDTO;

public class LigneCdeFournisseurValidator {
	
	
	public static List<String> validate(LigneCdeFournisseurDTO dto){
		
		List<String> errors = new ArrayList<>();
		
		if(dto==null) {
			
			errors.add("Veuillez selectionner une commande ");
			errors.add("Veuillez selectionner un article ");
			
			return errors;
			
		}
		
		
		if(dto.getCommandeFournisseur()==null) {
			errors.add("Veuillez selectionner une commande ");
		}
		
		if(dto.getArticle()==null) {
			errors.add("Veuillez selectionner un article ");
		}
		
		
		return errors;
		
		
	}

}
