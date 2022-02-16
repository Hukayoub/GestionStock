package com.sp.gestionStock.services;

import java.util.List;

import com.sp.gestionStock.dto.ArticleDTO;

public interface ArticleService {

	ArticleDTO save(ArticleDTO dto);
	
	ArticleDTO findById(Integer id);
	
	ArticleDTO findByCodeArticle(String codeArticle);
	
	List<ArticleDTO> findAll();
	
	void delete(Integer id);
}
