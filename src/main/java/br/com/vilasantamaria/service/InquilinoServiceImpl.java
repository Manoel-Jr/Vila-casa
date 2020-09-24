package br.com.vilasantamaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import br.com.vilasantamaria.model.Inquilino;
import br.com.vilasantamaria.repository.InquilinoRepository;

@Service
public class InquilinoServiceImpl {

	@Autowired
	private InquilinoRepository repository;
	
	
	public List<Inquilino> findAll(){
		return repository.findAll();
	}
	
	public Inquilino findOne(Long id) {
		return repository.getOne(id); 
	}
	
	public Inquilino save(Inquilino inquilino) {
		return repository.saveAndFlush(inquilino);
	}
	
	public Inquilino update(Inquilino inquilino, Long id) {
		inquilino.setId(id);
		Inquilino inquilinoAtualizado = repository.save(inquilino);
		return inquilinoAtualizado;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	@Query("select from inquilino "
			+ "where inquilino.cpf like %?1%")
	public List<Inquilino> findByCpf(String cpf){
		return repository.findByCpf(cpf);
	}

}
