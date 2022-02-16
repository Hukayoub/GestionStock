package com.sp.gestionStock.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.gestionStock.dto.FournisseurDTO;
import com.sp.gestionStock.exception.ErrorCodes;
import com.sp.gestionStock.exception.InvalidEntityException;
import com.sp.gestionStock.repository.FournisseurRepository;
import com.sp.gestionStock.services.FournisseurService;
import com.sp.gestionStock.validators.FournisseurValidator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FournisseurServiceImpl implements FournisseurService{

	@Autowired
	private FournisseurRepository fournisseurRepository;
	
	@Override
	public FournisseurDTO save(FournisseurDTO dto) {
		List<String> errors = FournisseurValidator.validate(dto);
		if(!errors.isEmpty()) 
		{
			log.error("Fournisseur not valid {}",dto);
			throw new InvalidEntityException("Le fournisseur n'est pas valide",ErrorCodes.FOURNISSEUR_NOT_FOUND);
		}
		
		
		return FournisseurDTO.fromEntity(fournisseurRepository.save(FournisseurDTO.toEntity(dto)));
	}

	@Override
	public FournisseurDTO findById(Integer id) {
		if(id==null)
		{
			log.error("id of fournisseur is null");
		}
		return ;
	}

	@Override
	public List<FournisseurDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
