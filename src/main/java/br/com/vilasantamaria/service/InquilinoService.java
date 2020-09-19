package br.com.vilasantamaria.service;

import java.util.List;

import br.com.vilasantamaria.model.Inquilino;

public interface InquilinoService {

	Inquilino salvarInquilino(Inquilino inquilino);
	
	List<Inquilino> listaInquilino();
	
	Inquilino buscarPorId(Long id);
	
	Inquilino atualizarDadosInquilino(Long id);
	
	void deletaInquilino(Long id);
	
	
}
