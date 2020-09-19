package br.com.vilasantamaria.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inquilino")
public class Inquilino implements Serializable{
	
	private static final long serialVersionUID = -2963520291975131339L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	@Column(unique = true, nullable = false, length = 14)
	private String cpf;
	
	@Column(length = 14)
	private String telefone;
	
	@Column(name = "quant_Pessoas")
	private Integer quantPessoas;
	
	private String fianca;
	
	private String mensalidade;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate data;
}
