package com.sp.gestionStock.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sp.gestionStock.controllers.api.ClientApi;
import com.sp.gestionStock.dto.ClientDTO;
import com.sp.gestionStock.services.ClientService;

public class ClientController implements ClientApi{

	@Autowired
	private ClientService clientService;
	
	@Override
	public ClientDTO save(ClientDTO dto) {
		return clientService.save(dto);
	}

	@Override
	public ClientDTO findById(Integer id) {
		return clientService.findById(id);
	}

	@Override
	public List<ClientDTO> findAll() {
		return clientService.findAll();
	}

	@Override
	public void delete(Integer id) {
		clientService.delete(id);
	}

}
