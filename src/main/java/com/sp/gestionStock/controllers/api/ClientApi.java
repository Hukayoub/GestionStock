package com.sp.gestionStock.controllers.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.gestionStock.dto.ClientDTO;

@RestController
public interface ClientApi {
	
	@PostMapping("/clients/create")
	ClientDTO save(@RequestBody ClientDTO dto);
	
	@GetMapping("/clients/{id}")
	ClientDTO findById(@PathVariable Integer id);
	
	@GetMapping("/clients/all")
	List<ClientDTO> findAll();
	
	@DeleteMapping("/clients/delete/{id}")
	void delete(@PathVariable Integer id);
}
