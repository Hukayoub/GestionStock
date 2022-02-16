package com.sp.gestionStock.services;

import java.util.List;

import com.sp.gestionStock.dto.CategorieDTO;

public interface CategorieService {
	
	CategorieDTO save(CategorieDTO dto);
	
	CategorieDTO findById(Integer id);
	
	CategorieDTO findByCodeCategorie(String codeArticle);
	
	List<CategorieDTO> findAll();
	
	void delete(Integer id);

}
