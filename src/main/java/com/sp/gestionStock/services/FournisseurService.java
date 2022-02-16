package com.sp.gestionStock.services;

import java.util.List;

import com.sp.gestionStock.dto.FournisseurDTO;

public interface FournisseurService {

	FournisseurDTO save(FournisseurDTO dto);
	
	FournisseurDTO findById(Integer id);
	
	List<FournisseurDTO> findAll();
	
	void delete(Integer id);
	
}
