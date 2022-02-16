package com.sp.gestionStock.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sp.gestionStock.controllers.api.CategorieApi;
import com.sp.gestionStock.dto.CategorieDTO;
import com.sp.gestionStock.services.CategorieService;

public class CategorieController implements CategorieApi{

	
	@Autowired
	private CategorieService categorieService;
	
	
	@Override
	public CategorieDTO save(CategorieDTO dto) {
		return categorieService.save(dto);
	}

	@Override
	public CategorieDTO findById(Integer id) {
		return categorieService.findById(id);
	}

	@Override
	public CategorieDTO findByCodeCategorie(String codeArticle) {
		return null;
	}

	@Override
	public List<CategorieDTO> findAll() {
		return categorieService.findAll();
	}

	@Override
	public void delete(Integer id) {
		categorieService.delete(id);
	}

}
