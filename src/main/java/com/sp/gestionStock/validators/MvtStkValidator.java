package com.sp.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import com.sp.gestionStock.dto.MvStkDTO;

public class MvtStkValidator {
	
	public static List<String> validate(MvStkDTO dto){
		
		List<String> errors = new ArrayList<>();
		
		if(dto==null) {
			errors.add("Veuillez rensiegner la date du mouvement stock");
			errors.add("Veuillez rensiegner la quantité du mouvement stock");
			errors.add("Veuillez selectionner un article");
			
			return errors;
		}
		
		if(dto.getDateMvt()==null) {
			
			errors.add("Veuillez rensiegner la date du mouvement stock");
			
		}
		if(dto.getQuantite()==null) {
			
			errors.add("Veuillez rensiegner la quantité du mouvement stock");
			
		}
		if(dto.getArticle()==null) {
			
			errors.add("Veuillez selectionner un article");
			
		}
		
		return errors;
		
	}

}
