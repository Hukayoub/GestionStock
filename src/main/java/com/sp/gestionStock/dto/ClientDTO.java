package com.sp.gestionStock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sp.gestionStock.models.Categorie;
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
				.
				.build();
		
	}
	
	// FIXME : Needs a toEntityMethod
}
