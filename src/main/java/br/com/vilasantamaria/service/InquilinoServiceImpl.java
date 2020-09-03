package br.com.vilasantamaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vilasantamaria.model.Inquilino;
import br.com.vilasantamaria.repository.InquilinoRepository;

@Service
public class InquilinoServiceImpl implements InquilinoService{

	@Autowired
	private InquilinoRepository repository;
	
	
	@Override
	public Inquilino salvarInquilino(Inquilino inquilino) {
		return repository.save(inquilino);
	}

	@Override
	public List<Inquilino> listaInquilino() {
		List<Inquilino> listInquilino = this.repository.findAll();
		return listInquilino;
	}

	@Override
	public Inquilino buscarPorId(Long id) {
		Optional<Inquilino> inquilino = repository.findById(id);
		return inquilino.get();
	}

	@Override
	public Inquilino atualizarDadosInquilino(Inquilino inquilino, Long id) {
		inquilino.setId(id);
		Inquilino inquilinoAtualiza = repository.save(inquilino);
		return inquilinoAtualiza;
	}

	@Override
	public void deletaInquilino(Long id) {
		repository.deleteById(id);
	}

}
