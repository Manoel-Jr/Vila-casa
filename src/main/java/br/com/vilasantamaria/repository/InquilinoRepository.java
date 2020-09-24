package br.com.vilasantamaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vilasantamaria.model.Inquilino;

@Repository
public interface InquilinoRepository extends JpaRepository<Inquilino, Long>{
    
	
	List<Inquilino> findByCpf(String cpf);
}
