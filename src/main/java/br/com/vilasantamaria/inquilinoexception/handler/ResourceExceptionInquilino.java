package br.com.vilasantamaria.inquilinoexception.handler;

import java.util.Date;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.vilasantamaria.inquilinoexception.InquilinoNoException;

public class ResourceExceptionInquilino extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(InquilinoNoException.class)
	public ResponseEntity<InquilinoError> handlerInquilinoNoExistException(InquilinoNoException ex){
		InquilinoError error = new InquilinoError(ex.getMessage(), HttpStatus.NOT_FOUND.value(), new Date());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<InquilinoError> inquilinoNoException(EmptyResultDataAccessException ex){
		InquilinoError inqError = new InquilinoError("Inquilino não Encontrado", HttpStatus.NOT_FOUND.value(), new Date());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(inqError);
	}
}
