package com.sp.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.gestionStock.models.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
