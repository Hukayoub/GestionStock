package com.sp.gestionStock.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.gestionStock.models.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
