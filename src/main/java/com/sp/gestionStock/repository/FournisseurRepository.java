package com.sp.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.gestionStock.models.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

}
