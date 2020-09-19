package br.com.vilasantamaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
//	@Override
//	public Inquilino salvarInquilino(Inquilino inquilino) {
//		return repository.save(inquilino);
//	}

//	@Override
//	public List<Inquilino> listaInquilino() {
//		List<Inquilino> listInquilino = this.repository.findAll();
//		return listInquilino;
//	}
//
//	@Override
//	public Inquilino buscarPorId(Long id) {
//		Optional<Inquilino> inquilino = repository.findById(id);
//		return inquilino.get();
//	}
//
//	@Override
//	public Inquilino atualizarDadosInquilino( Long id) {
//		Inquilino inquilino = new Inquilino();
//		inquilino.setId(id);
//		Inquilino inquilinoAtualiza = repository.save(inquilino);
//		return inquilinoAtualiza;
//	}
//
//	@Override
//	public void deletaInquilino(Long id) {
//		repository.deleteById(id);
//	}

}
