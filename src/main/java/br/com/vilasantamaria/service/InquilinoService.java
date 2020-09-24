package br.com.vilasantamaria.service;

import java.util.List;

import br.com.vilasantamaria.model.Inquilino;

public interface InquilinoService {

	
	List<Inquilino> findAll();

	Inquilino get(Long id); 

	Inquilino save(Inquilino inquilino);
	
	Inquilino update(Inquilino inquilino, Long id);

	void delete(Long id);
	
//	Inquilino buscarCpf(String cpf);

//	public List<Inquilino> findByCpf(String cpf){
//		return repository.findByCpf(cpf);
//	}
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
	
	
	
	
	
//	Inquilino salvarInquilino(Inquilino inquilino);
//	
//	List<Inquilino> listaInquilino();
//	
//	Inquilino buscarPorId(Long id);
//	
//	Inquilino atualizarDadosInquilino(Long id);
//	
//	void deletaInquilino(Long id);
//	
//	Inquilino buscar(String cpf);
	
	
	
	
	
	
}
