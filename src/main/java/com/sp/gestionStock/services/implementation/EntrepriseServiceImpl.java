package com.sp.gestionStock.services.implementation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.gestionStock.dto.EntrepriseDTO;
import com.sp.gestionStock.exception.ErrorCodes;
import com.sp.gestionStock.exception.InvalidEntityException;
import com.sp.gestionStock.models.Entreprise;
import com.sp.gestionStock.repository.EntrepriseRepository;
import com.sp.gestionStock.services.EntrepriseService;
import com.sp.gestionStock.validators.EntrepriseValidator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EntrepriseServiceImpl implements EntrepriseService{

	@Autowired
	private EntrepriseRepository entrepriseRepository;
	
	@Override
	public EntrepriseDTO save(EntrepriseDTO dto) {
		List<String> errors = EntrepriseValidator.validate(dto);
		if(!errors.isEmpty()) {
			log.error("Invalid Entreprise {}",dto);
			throw new InvalidEntityException("L'entreprise est ivalide",ErrorCodes.ENTREPRISE_NOT_FOUND);
		}
		return EntrepriseDTO.fromEntity(entrepriseRepository.save(EntrepriseDTO.toEntity(dto)));
	}

	@Override
	public EntrepriseDTO findById(Integer id) {
		if(id==null) {
			log.error("Categorie id is null");
			return null;
		}
		Optional<Entreprise> entreprise = entrepriseRepository.findById(id);
		
		return Optional.of(EntrepriseDTO.fromEntity(entreprise.get())).orElseThrow(()
				-> new EntityNotFoundException("Aucune Entreprise avec cette ID"));
		
	}

	@Override
	public List<EntrepriseDTO> findAll() {
		
		return entrepriseRepository
				.findAll()
				.stream()
				.map(EntrepriseDTO::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		
		if(id==null)
		{
			log.error("Categorie id is null");
			return;
		}
		
		entrepriseRepository.deleteById(id);
	}

}
