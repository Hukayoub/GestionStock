package com.sp.gestionStock.services.implementation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.gestionStock.dto.ClientDTO;
import com.sp.gestionStock.exception.ErrorCodes;
import com.sp.gestionStock.exception.InvalidEntityException;
import com.sp.gestionStock.repository.ClientRepository;
import com.sp.gestionStock.services.ClientService;
import com.sp.gestionStock.validators.ClientValidator;

import com.sp.gestionStock.models.Client;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public ClientDTO save(ClientDTO dto) {
		
		List<String> errors = ClientValidator.validate(dto);
		
		if(!errors.isEmpty()) {
			
			log.error("Client is invalid {}",dto);
			throw new InvalidEntityException("Le client is invalid ",ErrorCodes.CLIENT_NOT_FOUND);
			
		}
		//FIXME : ClientDTO needs a toEntity() method
		return ClientDTO.fromEntity(clientRepository.save(ClientDTO.toEntity(dto)));
	}

	@Override
	public ClientDTO findById(Integer id) {
		if(id==null) {
			log.error("Client is null");
			return null;
			
		}
		Optional<Client> client = clientRepository.findById(id);
		
		return Optional.of(ClientDTO.fromEntity(client.get())).orElseThrow(()
				-> new EntityNotFoundException("Aucun client Client avec ce id"));
		}

	@Override
	public List<ClientDTO> findAll() {
		
		return clientRepository.findAll()
				.stream()
				.map(ClientDTO::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		
		if(id==null) {
			
			log.error("Client id is null");
			return;
		}
		clientRepository.deleteById(id);
		
	}

}
