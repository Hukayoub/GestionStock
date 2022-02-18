package com.sp.gestionStock.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sp.gestionStock.models.CommandeClient;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientDTO {

	
	private Integer id;
	
	private String code;
	
	
	private Instant dateCommande;
	

	private ClientDTO client;
	
	@JsonIgnore
	private List<LigneCdeClientDTO> ligneCommandeClients;
	
	public static CommandeClientDTO fromEntity(CommandeClient commandeClient) {
		if(commandeClient==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  CommandeClientDTO.builder()
				.id(commandeClient.getId())
				.code(commandeClient.getCode())
				.dateCommande(commandeClient.getDateCommande())
				.client(ClientDTO.fromEntity(commandeClient.getClient()))
				.build();
		
	}
	
	public static CommandeClient toEntity(CommandeClientDTO CommandeClientDTO) {
		
		if(CommandeClientDTO==null) {
			return null;
			//TODO throw an exception
			
		}
		CommandeClient commandeClient = new CommandeClient();
		
		commandeClient.setId(CommandeClientDTO.getId());
		commandeClient.setCode(CommandeClientDTO.getCode());
		commandeClient.setDateCommande(CommandeClientDTO.getDateCommande());

		

		return commandeClient;
	}
	
}
