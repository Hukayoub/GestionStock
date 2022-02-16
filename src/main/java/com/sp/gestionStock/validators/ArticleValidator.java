package com.sp.gestionStock.validators;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.sp.gestionStock.dto.ArticleDTO;

public class ArticleValidator {

public static List<String> validate(ArticleDTO dto){

		
		List<String> errors = new ArrayList<>();
		
		if(dto==null) {
			
			errors.add("Veuillez renseigner le code d'article");
			errors.add("Veuillez renseigner la designation d'article");
			errors.add("Veuillez renseigner le prix unitaire de l'article");
			errors.add("Veuillez renseigner le taux TVA de l'article");
			errors.add("Veuillez renseigner le unitaire TTC de l'article");
			errors.add("Veuillez selectionner une catégorie");

			return errors;

		}
		
		if(!StringUtils.hasLength(dto.getCodeArticle())) {
			errors.add("Veuillez renseigner le code d'article");
		}
		if(!StringUtils.hasLength(dto.getDesignation())) {
			errors.add("Veuillez renseigner la designation d'article");
		}
		
		if(dto.getPrixUnitaireHt()==null) {
			errors.add("Veuillez renseigner le prix unitaire de l'article");
		}
		if(dto.getTauxTva()==null) {
			errors.add("Veuillez renseigner le taux TVA de l'article");
		}
		if(dto.getPrixUnitaireTtc()==null) {
			errors.add("Veuillez renseigner le unitaire TTC de l'article");
		}
		if(dto.getCategorie()==null) {
			errors.add("Veuillez selectionner une catégorie");
		}
		
		
		return errors;
	}

}
