package com.sp.gestionStock.controllers.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sp.gestionStock.dto.ArticleDTO;

public interface ArticleApi {

	@PostMapping(value="/articles/create")
	ArticleDTO save(@RequestBody ArticleDTO dto);
	
	@GetMapping("/articles/{id}")
	ArticleDTO findById(@PathVariable Integer id);
	
	@GetMapping("/articles/{code}")
	ArticleDTO findByCodeArticle(@PathVariable String codeArticle);
	
	@GetMapping("/articles/all")
	List<ArticleDTO> findAll();
	
	@DeleteMapping("/articles/delete/{id}")
	void delete(@PathVariable Integer id);
	
}
