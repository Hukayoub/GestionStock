package com.sp.gestionStock.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sp.gestionStock.controllers.api.ArticleApi;
import com.sp.gestionStock.dto.ArticleDTO;
import com.sp.gestionStock.services.ArticleService;

@RestController
public class ArticleController implements ArticleApi {

	@Autowired 
	ArticleService articleService;
	
	@Override
	public ArticleDTO save(ArticleDTO dto) {
		return articleService.save(dto);
	}

	@Override
	public ArticleDTO findById(Integer id) {
		return articleService.findById(id);
	}

	@Override
	public ArticleDTO findByCodeArticle(String codeArticle) {
		return null;
	}

	@Override
	public List<ArticleDTO> findAll() {
		return articleService.findAll();
	}

	@Override
	public void delete(Integer id) {
		articleService.delete(id);
	}

}
