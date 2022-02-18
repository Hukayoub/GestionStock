package com.sp.gestionStock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sp.gestionStock.models.MvStk;
import com.sp.gestionStock.models.TypeMvtStk;

import lombok.Data;

import lombok.Builder;

@Data
@Builder
public class MvStkDTO {

	private Integer id;
	
	private Instant dateMvt;
	
	
	private BigDecimal quantite;
	

	private ArticleDTO article;
	
	@JsonIgnore
	private TypeMvtStk typeMvt;
	
	
	public MvStkDTO fromEntity(MvStk mvStk) {
		
		if(mvStk==null) {
			
			return null;
			//throw new exeception
		}
		
		return MvStkDTO.builder()
				.id(mvStk.getId())
				.dateMvt(mvStk.getDateMvt())
				.quantite(mvStk.getQuantite())
				.article(ArticleDTO.fromEntity(mvStk.getArticle()))
				.build();
	}
	
	
public MvStk toEntity(MvStkDTO mvStkDTO) {
		
		if(mvStkDTO == null) {
			
			return null;
			//throw new Exception
			
		}
		
		MvStk mvStk = new MvStk();
		
		mvStk.setId(mvStkDTO.getId());
		mvStk.setDateMvt(mvStkDTO.getDateMvt());
		mvStk.setQuantite(mvStkDTO.getQuantite());
		
		return mvStk;
	}
}
