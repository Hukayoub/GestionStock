package com.sp.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.gestionStock.models.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

}
