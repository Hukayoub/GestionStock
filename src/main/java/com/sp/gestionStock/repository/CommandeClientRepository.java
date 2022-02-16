package com.sp.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.gestionStock.models.CommandeClient;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer> {

}
