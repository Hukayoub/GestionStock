package com.sp.gestionStock.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sp.gestionStock.controllers.api.EntrepriseApi;
import com.sp.gestionStock.dto.EntrepriseDTO;
import com.sp.gestionStock.services.EntrepriseService;

public class EntrepriseController implements EntrepriseApi {

	@Autowired
	private EntrepriseService entrepriseService;
	
	@Override
	public EntrepriseDTO save(EntrepriseDTO dto) {
		return entrepriseService.save(dto);
	}

	@Override
	public EntrepriseDTO findById(Integer id) {
		return entrepriseService.findById(id);
	}

	@Override
	public List<EntrepriseDTO> findAll() {
		return entrepriseService.findAll();
	}

	@Override
	public void delete(Integer id) {
		entrepriseService.delete(id);
	}

}
