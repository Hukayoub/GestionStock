package com.sp.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.gestionStock.models.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

	
}
