package com.sp.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.sp.gestionStock.dto.RolesDTO;

public class RolesValidator {
	
	
	public static List<String> validate(RolesDTO dto){
		
		List<String> errors = new ArrayList<>();
		
		
		if(dto==null) {
			
			errors.add("Veuillez renseigner le nom du rôle ");
			errors.add("Veuillez selectionner un utilisateur ");
			
			return errors;
			
		}
		
		
		if(StringUtils.hasLength(dto.getRoleName())) {
			errors.add("Veuillez renseigner le nom du rôle ");
		}
		
		if(dto.getUtilisateur()==null) {
			errors.add("Veuillez selectionner un utilisateur ");
		}
		
		
		return errors;
		
	}

}
