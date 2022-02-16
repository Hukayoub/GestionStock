package com.sp.gestionStock.controllers.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.gestionStock.dto.CategorieDTO;

@RestController
public interface CategorieApi {

	@PostMapping("/categories/create")
	CategorieDTO save(@RequestBody CategorieDTO dto);
	
	@GetMapping("/categories/{id}")
	CategorieDTO findById(@PathVariable Integer id);
	
	@GetMapping("/categories/{code}")
	CategorieDTO findByCodeCategorie(@PathVariable String codeArticle);
	
	@GetMapping("/categories/all")
	List<CategorieDTO> findAll();
	
	@DeleteMapping("/categories/delete/{id}")
	void delete(@PathVariable Integer id);
}
