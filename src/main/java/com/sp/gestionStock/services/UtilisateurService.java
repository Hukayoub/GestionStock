package com.sp.gestionStock.services;

import java.util.List;

import com.sp.gestionStock.dto.UtilisateurDTO;


public interface UtilisateurService {

	UtilisateurDTO save(UtilisateurDTO dto);
	
	UtilisateurDTO findById(Integer id);
	
	List<UtilisateurDTO> findAll();
	
	void delete(Integer id);
	
	
}
