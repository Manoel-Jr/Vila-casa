package br.com.vilasantamaria.inquilinoexception.handler;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InquilinoError implements Serializable{

	private static final long serialVersionUID = 8634516974945802821L;

	private String message;
	private Integer code;
	private Date data;
}
