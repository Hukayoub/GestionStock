package com.sp.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.sp.gestionStock.dto.CategorieDTO;


public class CategorieValidator {
	
	public static List<String> validate(CategorieDTO dto){

		
		List<String> errors = new ArrayList<>();
		
		if(dto==null || !StringUtils.hasLength(dto.getCode())) {
			errors.add("Veuillez renseigner le code de la catégorie");
		}
		
		return errors;
	}

}
