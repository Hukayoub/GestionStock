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
	
	public CommandeClientDTO fromEntity(CommandeClient commandeClient) {
		if(commandeClient==null) {
			return null;
			//TODO throw an exception
			
		}
		
		//Category -> CategoryDto

		return  CommandeClientDTO.builder()
				.code(getCode())
				.dateCommande(getDateCommande())
				.client(getClient())
				.build();
		
	}
	
	public CommandeClient toEntity(CommandeClientDTO CommandeClientDTO) {
		
		if(CommandeClientDTO==null) {
			return null;
			//TODO throw an exception
			
		}
		CommandeClient commandeClient = new CommandeClient();
		
		commandeClient.setCode(CommandeClientDTO.getCode());
		commandeClient.setDateCommande(CommandeClientDTO.getDateCommande());
		commandeClient.setClient(CommandeClientDTO.getClient());

		

		return commandeClient;
	}
	
}
