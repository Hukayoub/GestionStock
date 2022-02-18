package com.sp.gestionStock.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sp.gestionStock.controllers.api.FournisseurApi;
import com.sp.gestionStock.dto.FournisseurDTO;
import com.sp.gestionStock.services.FournisseurService;

public class FournisseurController implements FournisseurApi {

	@Autowired
	private FournisseurService fournisseurService;
	
	@Override
	public FournisseurDTO save(FournisseurDTO dto) {
		return fournisseurService.save(dto);
	}

	@Override
	public FournisseurDTO findById(Integer id) {
		return fournisseurService.findById(id);
	}

	@Override
	public List<FournisseurDTO> findAll() {
		return fournisseurService.findAll();
	}

	@Override
	public void delete(Integer id) {
		fournisseurService.delete(id);
	}

}
