package com.sp.gestionStock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sp.gestionStock.models.Categorie;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategorieDTO {

	private Integer id;
	
	private String code;
	
	private String designation;

	@JsonIgnore
	private List<ArticleDTO> articles;
	
	public static CategorieDTO fromEntity(Categorie categorie) {
		if(categorie==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  CategorieDTO.builder()
				.id(categorie.getId())
				.code(categorie.getCode())
				.designation(categorie.getDesignation())
				.build();
		
	}
	
	public static Categorie toEntity(CategorieDTO categorieDTO) {
		if(categorieDTO==null) {
			return null;
			//TODO throw an exception

		}
		
		//FIXME
		return ;
	}
}
