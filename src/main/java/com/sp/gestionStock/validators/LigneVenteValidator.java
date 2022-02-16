package com.sp.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import com.sp.gestionStock.dto.LigneVenteDTO;

public class LigneVenteValidator {
	
	public static List<String> validate(LigneVenteDTO dto){
		
		List<String> errors = new ArrayList<>();
		
		if(dto==null) {
			
			errors.add("Veuillez selectionner une vente ");
			errors.add("Veuillez renseigner la qunatité ");
			
			return errors;
			
		}
		
		
		if(dto.getVente()==null) {
			errors.add("Veuillez selectionner une vente ");
		}
		
		if(dto.getQuantite()==null) {
			errors.add("Veuillez renseigner la qunatité");
		}
		
		
		return errors;
		
		
	}

}
