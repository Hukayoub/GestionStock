package com.sp.gestionStock.services;

import java.util.List;

import com.sp.gestionStock.dto.EntrepriseDTO;

public interface EntrepriseService {

	EntrepriseDTO save(EntrepriseDTO dto);
	
	EntrepriseDTO findById(Integer id);
	
	List<EntrepriseDTO> findAll();
	
	void delete(Integer id);
	
}
