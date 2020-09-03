package br.com.vilasantamaria.inquilinoexception;

public class InquilinoNoException extends RuntimeException{
	
	private static final long serialVersionUID = -4784539219031636878L;

	public InquilinoNoException(String msg) {
		super(msg);
	}
}
