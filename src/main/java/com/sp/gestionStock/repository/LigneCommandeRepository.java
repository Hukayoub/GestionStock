package com.sp.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.gestionStock.models.LigneCdeClt;

public interface LigneCommandeRepository extends JpaRepository<LigneCdeClt, Integer>{

}
