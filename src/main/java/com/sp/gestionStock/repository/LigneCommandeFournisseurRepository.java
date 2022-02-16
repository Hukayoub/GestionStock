package com.sp.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.gestionStock.models.LigneCdeFournisseur;

public interface LigneCommandeFournisseurRepository extends JpaRepository<LigneCdeFournisseur, Integer>{

}
