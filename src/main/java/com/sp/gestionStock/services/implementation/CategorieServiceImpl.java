package com.sp.gestionStock.services.implementation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.gestionStock.dto.CategorieDTO;
import com.sp.gestionStock.exception.ErrorCodes;
import com.sp.gestionStock.exception.InvalidEntityException;
import com.sp.gestionStock.models.Categorie;
import com.sp.gestionStock.repository.CategorieRepository;
import com.sp.gestionStock.services.CategorieService;
import com.sp.gestionStock.validators.CategorieValidator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategorieServiceImpl implements CategorieService{

	@Autowired
	private CategorieRepository categorieRepository;
	
	@Override
	public CategorieDTO save(CategorieDTO dto) {
		List<String> errors = CategorieValidator.validate(dto);
		if(!errors.isEmpty()) {
			log.error("Categorie not valid {}",dto);
			throw new InvalidEntityException("Categorie n'est pas valid",ErrorCodes.CATEGORY_NOT_FOUND);
		}
		return CategorieDTO.fromEntity(categorieRepository.save(CategorieDTO.toEntity(dto)));
	}  

	@Override
	public CategorieDTO findById(Integer id) {
		if(id==null) {
			log.error("Categorie id is null");
			return null;
		}
		Optional<Categorie> categorie = categorieRepository.findById(id);
		
		return Optional.of(CategorieDTO.fromEntity(categorie.get())).orElseThrow(()
				-> new EntityNotFoundException("Aucune catégorie avec ce ID"));
	}

	@Override
	public CategorieDTO findByCodeCategorie(String codeCategorie) {
		// TODO needs a methdod in the interface CategorieService
		return null;
	}

	@Override
	public List<CategorieDTO> findAll() {
		
		return categorieRepository.findAll().stream().map(CategorieDTO::fromEntity)
				.collect(Collectors.toList());
		}

	@Override
	public void delete(Integer id) {
		
		if(id==null) {
			log.error("Article id is null");
			return;
		}
		categorieRepository.deleteById(id);
		
	}

}
