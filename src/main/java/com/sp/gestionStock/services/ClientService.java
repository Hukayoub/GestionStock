package com.sp.gestionStock.services;

import java.util.List;

import com.sp.gestionStock.dto.ClientDTO; 

public interface ClientService {

	ClientDTO save(ClientDTO dto);
	
	ClientDTO findById(Integer id);
	
	List<ClientDTO> findAll();
	
	void delete(Integer id);
}
