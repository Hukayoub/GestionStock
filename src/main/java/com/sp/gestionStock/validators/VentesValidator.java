package com.sp.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.sp.gestionStock.dto.VentesDTO;

public class VentesValidator {

	
	public static List<String> validate(VentesDTO dto){
		
		List<String> errors = new ArrayList<>();
		
		
		if(!StringUtils.hasLength(dto.getCode())) {
			
			errors.add("Veuillez renseigner le code de la vente");
		}
		
		if(dto.getDateVente()==null) {
			
			errors.add("Veuillez renseigner la date de la vente de la vente");
		}
		
		
		
		return errors;
		
	}
	
}
