package com.sp.gestionStock.controllers.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.gestionStock.dto.EntrepriseDTO;

@RestController
public interface EntrepriseApi {
	
	@PostMapping("/entreprises/create")
	EntrepriseDTO save(@RequestBody EntrepriseDTO dto);
	
	@GetMapping("/entreprises/{id}")
	EntrepriseDTO findById(@PathVariable Integer id);
	
	@GetMapping("/entreprises/all")
	List<EntrepriseDTO> findAll();
	
	@DeleteMapping("/entreprises/delete/{id}")
	void delete(@PathVariable Integer id);

}
