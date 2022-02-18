package com.sp.gestionStock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sp.gestionStock.models.Client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDTO {
	
	private Integer id;
	
	private String nom;
	
	
	private String prenom;
	
	
	private AdresseDTO adresse;

	
	private String photo;
	
	
	private String mail;
	
	
	private String numTel;
	
	@JsonIgnore
	private List<CommandeClientDTO> commandesClient;
	
	public static ClientDTO fromEntity(Client client) {
		if(client==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  ClientDTO.builder()
				.id(client.getId())
				.nom(client.getNom())
				.prenom(client.getPrenom())
				.adresse(AdresseDTO.fromEntity(client.getAdresse()))
				.photo(client.getPhoto())
				.mail(client.getMail())
				.numTel(client.getNumTel())
				.build();
		
	}
	
	// FIXME : Needs a toEntityMethod
	
	public static Client toEntity(ClientDTO clientDTO) {
		
		if(clientDTO == null) {
			return null;
		}
		
		Client client = new Client();
		
		client.setId(clientDTO.getId());
		client.setNom(clientDTO.getNom());
		client.setPrenom(clientDTO.getPrenom());
		client.setPhoto(clientDTO.getPhoto());
		client.setMail(clientDTO.getMail());
		client.setNumTel(clientDTO.getNumTel());
		
		
		return client;
	}
}
