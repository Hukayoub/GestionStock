package com.sp.gestionStock.dto;

import com.sp.gestionStock.models.Roles;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDTO {

	private Integer id;
	
	private String roleName;
	

	private UtilisateurDTO utilisateur;
	
public RolesDTO fromEntity(Roles roles) {
		
		if(roles==null) {
			
			return null;
			//throw new exeception
		}
		
		return RolesDTO.builder()
				.id(roles.getId())
				.roleName(roles.getRoleName())
				.utilisateur(UtilisateurDTO.fromEntity(roles.getUtilisateur()))
				.build();
	}
	
	
public Roles toEntity(RolesDTO rolesDTO) {
		
		if(rolesDTO == null) {
			
			return null;
			//throw new Exception
			
		}
		
		Roles roles = new Roles();
		
		roles.setId(rolesDTO.getId());
		roles.setRoleName(rolesDTO.getRoleName());
		
		return roles;
	}
}
