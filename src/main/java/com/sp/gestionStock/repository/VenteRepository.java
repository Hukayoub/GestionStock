package com.sp.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.gestionStock.models.Ventes;

public interface VenteRepository extends JpaRepository<Ventes, Integer>{

}
