package com.sp.gestionStock.controllers.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.gestionStock.dto.FournisseurDTO;

@RestController
public interface FournisseurApi {
	
	@PostMapping("/fournisseurs/create")
	FournisseurDTO save(@RequestBody FournisseurDTO dto);
	
	@GetMapping("/fournisseurs/{id}")
	FournisseurDTO findById(@PathVariable Integer id);
	
	@GetMapping("/fournisseurs/all")
	List<FournisseurDTO> findAll();
	
	@DeleteMapping("/fournisseur/delete/{id}")
	void delete(@PathVariable Integer id);

}
