package com.sp.gestionStock.services.implementation;

import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.gestionStock.dto.ArticleDTO;
import com.sp.gestionStock.exception.ErrorCodes;
import com.sp.gestionStock.exception.InvalidEntityException;
import com.sp.gestionStock.models.Article;
import com.sp.gestionStock.repository.ArticleRepository;
import com.sp.gestionStock.services.ArticleService;
import com.sp.gestionStock.validators.ArticleValidator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	@Override
	public ArticleDTO save(ArticleDTO dto) {
		List<String> errors =  ArticleValidator.validate(dto);
		if(!errors.isEmpty()) {
			log.error("Article is not valid {} ",dto);
			throw new InvalidEntityException("l'article n'est pas valide",ErrorCodes.ARTICLE_NOT_VALID,errors);
			
		}
		return ArticleDTO.fromEntity(articleRepository.save(ArticleDTO.toEntity(dto)));
	}

	@Override
	public ArticleDTO findById(Integer id) {
		if(id==null) {
			log.error("Article ID is null");
			return null;
		}
		Optional<Article> article = articleRepository.findById(id);
		
		return Optional.of(ArticleDTO.fromEntity(article.get())).orElseThrow(() 
				-> new EntityNotFoundException("Auncun article avec l'ID "));
	}

	@Override
	public ArticleDTO findByCodeArticle(String codeArticle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArticleDTO> findAll() {
	
		return articleRepository.findAll().stream().map(ArticleDTO::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		if(id==null) {
			log.error("Article id is null");
			return;
		}
		articleRepository.deleteById(id);
	}

}
