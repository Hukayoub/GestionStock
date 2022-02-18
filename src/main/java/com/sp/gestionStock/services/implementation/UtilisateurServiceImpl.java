package com.sp.gestionStock.services.implementation;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.gestionStock.dto.EntrepriseDTO;
import com.sp.gestionStock.dto.UtilisateurDTO;
import com.sp.gestionStock.exception.ErrorCodes;
import com.sp.gestionStock.exception.InvalidEntityException;
import com.sp.gestionStock.models.Entreprise;
import com.sp.gestionStock.models.Utilisateur;
import com.sp.gestionStock.repository.UtilisateurRepository;
import com.sp.gestionStock.services.UtilisateurService;
import com.sp.gestionStock.validators.UtilisateurValidator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UtilisateurServiceImpl implements UtilisateurService {

	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	@Override
	public UtilisateurDTO save(UtilisateurDTO dto) {
		List<String> errors = UtilisateurValidator.validate(dto);
		
		if(!errors.isEmpty())
		{
			log.error("Utilisateur n'est pas valide {}",dto);
			throw new InvalidEntityException("Utilisateur n'est pas valide",ErrorCodes.UTILISATEUR_CLIENT_NOT_FOUND);
		}
		return UtilisateurDTO.fromEntity(utilisateurRepository.save(UtilisateurDTO.toEntity(dto)));
	}

	@Override
	public UtilisateurDTO findById(Integer id) {
		if(id==null)
		{
			log.error("L'id is null");
			return null;
		}
		
			Optional<Utilisateur> utilisateur = utilisateurRepository.findById(id);
		
		return 
				Optional.of(UtilisateurDTO.fromEntity(utilisateur.get())).orElseThrow(()
				-> new EntityNotFoundException("Aucune Entreprise avec cette ID"));
	}

	@Override
	public List<UtilisateurDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
