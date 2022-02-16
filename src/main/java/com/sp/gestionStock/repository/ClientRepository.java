package com.sp.gestionStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.gestionStock.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
