package com.sp.gestionStock.dto;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sp.gestionStock.models.Article;
import com.sp.gestionStock.models.Categorie;
import com.sp.gestionStock.models.MvStk;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArticleDTO {

	private Integer id;
	
	private String codeArticle;
	
	
	private String designation;
	
	private BigDecimal prixUnitaireHt;
	
	private BigDecimal tauxTva;
	
	private BigDecimal prixUnitaireTtc;
	
	private String photo;
	

	private Categorie categorie;
	
	
	@JsonIgnore
	private List<MvStk> mvStks;
	
	public static ArticleDTO fromEntity(Article article) {
		if(article==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  ArticleDTO.builder()
				.codeArticle(article.getCodeArticle())
				.designation(article.getDesignation())
				.prixUnitaireHt(article.getPrixUnitaireHt())
				.tauxTva(article.getPrixUnitaireHt())
				.prixUnitaireTtc(article.getPrixUnitaireTtc())
				.photo(article.getPhoto())
				.categorie(article.getCategorie())
				.build();
		
	}
	
	public static Article toEntity(ArticleDTO articleDTO) {
		
		if(articleDTO==null) {
			return null;
			//TODO throw an exception
			
		}
		Article article = new Article();
		
		article.setCodeArticle(articleDTO.getCodeArticle());
		article.setDesignation(articleDTO.getDesignation());
		article.setPrixUnitaireHt(articleDTO.getPrixUnitaireHt());
		article.setTauxTva(articleDTO.getTauxTva());
		article.setPrixUnitaireTtc(articleDTO.getTauxTva());
		article.setPhoto(articleDTO.getPhoto());
		article.setCategorie(articleDTO.getCategorie());
		

		return article;
	}
}
